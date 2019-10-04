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

  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/docker-repository.png)

* Step 6: Create cluster

  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/create-cluster.png)

* Step 7: Select Fargate template

  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/fargate-cluster-template.png)

* Step 8: Enter cluster name and create cluster

  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/cluster-name.png)

* Step 9: Define new task

  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/new-task-definition.png)

* Step 10: Select launch type compatibility
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/fargate-launch-type.png)

* Step 11: Enter task name and role
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/task-name-role.png)

* Step 12: Select launch type compatibility
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/memory-cpu.png)

* Step 13: Add container and hit create
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/container.png)

* Step 14: Go to your cluster and create new service
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/new-service.png)

* Step 15: Configure service
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/configure-service.png)

* Step 16: Configure network
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/configure-network.png)

* Step 17: Configure auto scaling
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/configure-auto-scaling.png)


* Step 18: Review and create service


* Step 19: View service
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/view-service.png)

* Step 20: View service ENI
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/service-eni.png)

* Step 21: Copy pulic IP after clicking on ENI link
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/public-ip.png)

* Step 22: Update security group - add custom TCP rule for inbound traffic on port 8080
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/update-security-group.png)




* Step 23: http://54.234.226.180:8080/get
  ![alt text](https://github.build.ge.com/212601344/aws-docker-example/blob/master/images/get-message.png)



### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](httpdqds://spring.io/guides/tutorials/bookmarks/)
