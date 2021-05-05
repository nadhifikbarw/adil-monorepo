from adil_scraper.items import Peraturan
import datetime
import scrapy


class KategoriSpider(scrapy.Spider):
    name = 'kategori'
    allowed_domains = ['peraturan.go.id']

    custom_settings = {
        'FEED_URI': f"export/peraturan_data_{datetime.date.today()}.json",
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

    def parse(self, response, **kwargs):
        anchors = response.xpath("//tbody[1]/tr/td[5]/a")
        for anchor in anchors:
            item = Peraturan()
            item['name'] = anchor.xpath('text()').get().replace("\n", " ")
            item['url'] = 'https://peraturan.go.id' + anchor.xpath('@href').get()
            yield item