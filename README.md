# Description

This is a NGINX Load Balancer example with two instances of the Spring Boot app, which will send 70% of requests to service-instance-1 and 30% of requests to service-instance-2. 

## How to run

- mvn clean install -f ./service/pom.xml
- docker build -f ./service/Dockerfile ./service
- docker-compose up -d
- for i in {1..10}; do curl http://localhost:9090; done

The expected result of this command is:
- 7 requests to service-instance-1 
- 3 requests to service-instance-2