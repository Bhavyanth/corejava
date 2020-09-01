package com.rewards.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHystrix
public class GateWayConfig {
	
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
	    return builder.routes()
	    		 .route(p -> p
	    		            .path("/api/test/**")
	    		            .filters(f -> f.addRequestHeader("Hello", "World").hystrix(config-> config.setName("BonusParameters")))
	    		            .uri("http://localhost:8702"))
	    		 .route(p -> p
	    		            .path("/api/**")
	    		            .filters(f -> f.addRequestHeader("Hello", "World").hystrix(config-> config.setName("BonusParameters")))
	    		            .uri("http://localhost:8701"))
	        .route(p -> p
	            .path("/get")
	            .filters(f -> f.addRequestHeader("Hello", "World"))
	            .uri("http://httpbin.org:80"))
	        .route(p -> p
	            .host("*.hystrix.com")
	            .filters(f -> f.hystrix(config -> config.setName("mycmd")))
	            .uri("http://httpbin.org:80")).
	        build();
	}

	
	/* servicediscoverry */
	
}
