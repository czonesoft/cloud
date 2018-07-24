package com.czj.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class ApigatewayApplication {
//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes().build();
//    }

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/u/**")
                        .filters(f -> f.rewritePath("/u/(?<path>.*)", "/${path}"))
                        .uri("lb://PROVIDERUSER")// http://localhost:8001/user/1
                        .id("user-service"))
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApigatewayApplication.class, args);
    }
}
