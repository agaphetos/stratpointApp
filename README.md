# Project Title

StratpointApp - This app was created for my application on Stratpoint as a Java Developer

## Getting Started

Clone or download as ZIP this project. You can run this on an Apache Tomcat Server. Run using maven
```
mvn/mvnw spring-boot:run
```
This will be running on http://localhost:8080/ as a REST API

### Prerequisites

What things you need to make it running

* [Java JDK 1.6+ or higher](http://www.oracle.com/technetwork/indexes/downloads/index.html)
* [Maven](https://maven.apache.org/download.cgi)
* [Eclipse](https://www.eclipse.org/downloads/?)
* or TextEditors of your choice (Atom, Sublime, VSCode, Notepad++)

### Installing

Run the package using maven

```
mvn/mvnw spring-boot:run
```

Open browser (Chrome/Firefox/Safari/IE/Edge)
Then type on URL
```
localhost:8080/profile
```

This will return a JSON text of all profiles returned from our REST API
```
[{"id":"59914e16322c1b042d4fdf2b","active":true,"blocked":false,"balance":"2,839.14","picture":"http://placehold.it/50x50","age":24,"name":{"first":"Shepard","middle":"V","last":"Potts"},"email":"shepard.potts@stratpoint.us","phone":"+63 (881) 451-3628","address":"167 Woodhull Street, Oberlin, South Carolina, 3258","profile":"Tempor fugiat cillum occaecat laboris aliqua labore laboris qui velit culpa nostrud cupidatat. Reprehenderit nulla proident cupidatat commodo ex ad nostrud culpa adipisicing nostrud mollit elit adipisicing sint. Pariatur nulla cillum magna labore qui aliqua nulla nisi. Sint voluptate excepteur veniam sunt et ex est. Non et ea incididunt ut non. Nisi consectetur cupidatat aliquip laborum culpa nostrud fugiat ut culpa est ea veniam deserunt pariatur. Reprehenderit sit exercitation anim labore officia fugiat et amet sint do.","date_registered":1439564911632},{"id":"59914e1633eb7f7472171dd3","active":false,"blocked":true,"balance":"3,664.29","picture":"http://placehold.it/50x50","age":32,"name":{"first":"Dina","middle":"B","last":"Johnson"},"email":"dina.johnson@stratpoint.name","phone":"+63 (916) 448-3464","address":"704 Oliver Street, Leyner, Marshall Islands, 4403","profile":"Laboris anim culpa aliqua qui sint quis cupidatat. Aliquip consequat excepteur magna magna fugiat. Amet qui ut elit ipsum non adipisicing Lorem laboris.","date_registered":1467501490268},{"id":"59914e16ced6ae98492a6dd0","active":false,"blocked":true,"balance":"1,409.18","picture":"http://placehold.it/50x50","age":33,"name":{"first":"Shannon","middle":"B","last":"Conrad"},"email":"shannon.conrad@stratpoint.net","phone":"+63 (945) 484-2716","address":"833 Montague Terrace, Deercroft, North Dakota, 6139","profile":"Reprehenderit id consequat tempor pariatur ad ea proident aute fugiat consequat laboris officia minim non. Do irure esse sit amet aute enim labore incididunt tempor ut sunt irure. Ipsum amet dolore anim labore aute excepteur ea. Nostrud sint eiusmod anim pariatur excepteur magna reprehenderit.","date_registered":1403183084971},
....
```

## Built With

* [STS](https://spring.io/tools) - An all-in-one Eclipse based IDE for Java Spring Development
* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

Used [GitHub](http://github.com/) for versioning.

## Authors

* **James Levin Calado** - *Initial work* - [Agaphetos](https://github.com/agaphetos)
