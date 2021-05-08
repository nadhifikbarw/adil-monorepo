from urllib.parse import urlparse, parse_qs
import requests
import datetime
import scrapy


class PeraturanSpider(scrapy.Spider):
    name = 'peraturan'
    allowed_domains = ['peraturan.go.id']

    custom_settings = {
        'FEED_URI': f"export/peraturan_{datetime.date.today()}",
        'FEED_FORMAT': 'json',
        'FEED_EXPORTERS': {
            'json': 'scrapy.exporters.JsonItemExporter',
        },
        'FEED_EXPORT_ENCODING': 'utf-8',
    }

    start_urls = [
        'https://peraturan.go.id/peraturan/kategori.html?id=7',
        'https://peraturan.go.id/peraturan/kategori.html?id=14',
        'https://peraturan.go.id/peraturan/kategori.html?id=18',
        'https://peraturan.go.id/peraturan/kategori.html?id=19',
        'https://peraturan.go.id/peraturan/kategori.html?id=38',
        'https://peraturan.go.id/peraturan/kategori.html?id=75',
        'https://peraturan.go.id/peraturan/kategori.html?id=34',
        'https://peraturan.go.id/peraturan/kategori.html?id=29',
        'https://peraturan.go.id/peraturan/kategori.html?id=11',
        'https://peraturan.go.id/peraturan/kategori.html?id=27'
    ]

    @staticmethod
    def snakeify(text):
        return "_".join(text.lower().strip().split())

    @staticmethod
    def parse_id_from_url(url):
        return parse_qs(urlparse(url).query)['id'][0]

    def parse(self, response, **kwargs):
        anchors = response.xpath("//tbody[1]/tr/td[5]/a")
        for anchor in anchors:
            url = 'https://peraturan.go.id' + anchor.xpath('@href').get()
            yield scrapy.Request(url=url, callback=self.parse_peraturan)

    def parse_peraturan(self, response, **kwargs):
        url = response.url
        item = {
            'id': self.parse_id_from_url(url),
            'source': url,
            'document': [],
            'document_status': []
        }
        # Parse metadata
        rows = response.xpath('//tr')
        for row in rows:
            key = self.snakeify(row.xpath('th/text()').get())
            item[key] = row.xpath('td/div[@class="kv-attribute"]/text()').get()

        # Parse documents download
        documents = response.xpath("//a[@title='Download']/@href").getall()
        item['document'] = documents

        # Check document head status
        for doc in documents:
            r = requests.head(doc)
            item['document_status'].append(r.status_code)


        # Parse categories
        categories = response.xpath("//span[@class='badge badge-warning']/text()").getall()
        item['category'] = categories

        # Parse data section
        headings = response.css('.panel-heading').xpath('text()').getall()
        headings = [self.snakeify(heading) for heading in headings]

        # Parse relation
        url_list = []
        if "relasi" in headings:
            rows = response.css(".col-md-3 > div.panel:last-child > .panel-body > *:not(br)")
            key = ""
            for row in rows:
                if len(row.attrib) == 0:
                    key = row.xpath('text()').get().replace(':', '')
                    key = self.snakeify(key)
                    if not item.get(key, False):
                        item[key] = []
                else:
                    url = 'https://peraturan.go.id' + row.attrib['href']
                    val = self.parse_id_from_url(url)
                    item[key].append(val)
                    # Check if allowed to be crawled
                    if (key in ["diubah_oleh", "dicabut_oleh", "mengubah", "mencabut"]):
                        yield scrapy.Request(url=url, callback=self.parse_peraturan)
        if len(documents):
            yield item
