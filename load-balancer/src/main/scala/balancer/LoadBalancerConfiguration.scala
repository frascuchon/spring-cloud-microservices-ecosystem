package balancer

import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
class LoadBalancerConfiguration {

}