# Adil Monorepo

Adil monorepo is the centralized repository to keep track and document development process for Adil, a Google Bangkit Capstone Team that consist of 6 students from 3 learning paths, Machine Learning, Android Development, and Cloud Computing, we are:

1. Rais Azka - M0050357
2. Calvin Leonardo - M0050358
3. Nadhif Ikbar Wibowo - C0040201
4. Grace R Simanjuntak - C0121175
5. Santoni Dyaz - A0050364
6. Patricia Fiona - A1121437

We're trying to solve Indonesian hyper-regulation problems causing disharmonious, inconsistent, overlapping, that leads to ambiguous interpretations of legislation and difficult for citizens to access the most relevant regulations for their needs. We want to help Indonesian to access legal information to find answers to relevant legal questions through a comprehensive and centralized digital legal archive platform based on Android as a bridge between legal experts and legal aid seekers. We are leveraging ML to standardize PDF-based legal products to a more open format (HTML) combined with Full-text search capability built in the cloud for scalability.

## Project Structure
* adil-android - Android application project
* adil-crawler - Scrapy project to extract dataset 
* adil-data-exploration - Raw data exploration, and processor
* adil-data-formalization - Set of formalization process to conform data to the final data model 
* adil-firestore-loader - Load data to Firestore
* adil-mongodb-loader - Load data to MongoDb
* adil-elasticsearch-loader - Load data to localhost elasticsearch

## Open Law Specification Initiative

One way to better resolve this hyper-regulation problems is by shifting to a more open approach to represent regulation documents in its digital form instaed of using regular PDF or DOC(X) data format (current status-quo), one of our member is trying to define an open specification to represent law document in an open data format (HTML) adhering to [5-stars Open Data](https://5stardata.info/en/) principles to promote reusability and ease of further automation / manipulation, the scope of this initiative is outside of this current project but serves as the basis of where future development might be going.

[Adil Open Law Specification](https://github.com/nadhifikbarw/adil-open-law-specification)


