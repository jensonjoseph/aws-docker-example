# Getting Started:
* Step 1: mvn clean install
* Step 2: docker build -t aws-docker-example .
        'If you wish to see image was successfully created use command'
        docker images
* Step 3: docker run -p 8080:8080 aws-docker-example

* Step 4: docker tag aws-docker-example jensonjoseph/aws-docker-example
          (will work only if you are logged in to docker account via cli)
          (where jensonjoseph should be replaced by your docker username)
* Step 5: docker push jensonjoseph/aws-docker-example

 

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](httpdqds://spring.io/guides/tutorials/bookmarks/)
