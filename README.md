# spring-cloud-microservices-ecosystem
Micro services integration with Eureka Service Registry and Zuul as load balancer

2 microservices applications + 1 eureka server + 1 zuul load balancer

# Structure
* eureka : the eureka server spring boot project (single or cluster configuration)
* load-balancer: the zuul proxy load balancer project
* appX: simple microservices spring boot application registered to eureka server


#Prerequisites
* docker (https://docs.docker.com/)
* dnsmaq (https://blog.amartynov.ru/archives/dnsmasq-docker-service-discovery/)


# Build
Run :

$>./build.sh 

#  Launch 
Run: 

$>./start.sh 

You can see eureka control panel at http://eureka-server-8700:8700



 


