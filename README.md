# spring-cloud-microservices-ecosystem
Micro services integration with Eureka Service Registry and Zuul as load balancer

2 microservices applications + 1 eureka server + 1 zuul load balancer

# Structure

-<root>
 |-eureka : the eureka server spring boot project (single or cluster configuration)
 |-load-balancer: the zuul proxy load balancer project
 |- appX: simple microservices spring boot application registered to eureka server
