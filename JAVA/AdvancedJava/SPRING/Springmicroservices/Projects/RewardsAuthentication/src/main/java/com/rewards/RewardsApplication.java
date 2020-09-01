package com.rewards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*This is a Spring Boot main class. A Spring Boot REST application loads through this class. We can also see that this class is created with the 
 * annotation @SpringBootApplication . As per the Spring documentation, the annotation @SpringBootApplication is equivalent to using @Configuration,
 *  @EnableAutoConfiguration, and @ComponentScan, and these annotations are frequently used together. Most of the time, in Spring Boot development,
 *   the main class is always annotated with all three of these important annotations.*/

/*Spring @Configuration annotation is part of the spring core framework. Spring Configuration annotation indicates that the class has @Bean
 *  definition methods. So Spring container can process the class and generate Spring Beans to be used in the application*/

/*@EnableAutoConfiguration automatically configures the Spring application based on its included jar files, it sets up defaults or helper based 
 * on dependencies in pom.xml. Auto-configuration is usually applied based on the classpath and the defined beans. Therefore, we donot need to define 
 * any of the DataSource, EntityManagerFactory, TransactionManager etc and magically based on the classpath, Spring Boot automatically creates proper
 *  beans and registers them for us.*/

/*@ComponentScan provides scope for spring component scan, it simply goes though the provided base package and picks up dependencies required by
 *  @Bean or @Autowired etc, In a typical Spring application, @ComponentScan is used in a configuration classes, the ones annotated with @Configuration.
 *   Configuration classes contains methods annotated with @Bean. These @Bean annotated methods generate beans managed by Spring container. Those beans 
 *   will be auto-detected by @ComponentScan annotation. There are some annotations which make beans auto-detectable like @Repository , @Service,
 *    @Controller, @Configuration, @Component*/

/*So by default, all packages that falls under @SpringBootApplication declaration will be scanned.

Assuming my main class ExampleApplication that has @SpringBootApplication declaration is declared inside com.example.something, then all components that falls under com.example.something is scanned while com.example.applicant will not be scanned.

So, there are two ways to do it based on this question. Use

@SpringBootApplication(scanBasePackages={
"com.example.something", "com.example.application"})*/


/*So I use the second approach, by restructuring my packages and it worked ! Now my packages structure became like this.

src/
├── main/
│   └── java/
|       ├── com.example/
|       |   └── Application.java
|       ├── com.example.model/
|       |   └── User.java
|       ├── com.example.controller/
|       |   ├── IndexController.java
|       |   └── UsersController.java
|       └── com.example.service/
|           └── UserService.java
└── resources/
    └── application.properties*/
@SpringBootApplication(scanBasePackages = {"com.rewards.controller" ,"com.rewards.service" ,"com.rewards.serviceimpl" ,"com.rewards.repositories","com.rewards.config","com.rewards.utils"})
@EnableEurekaClient
@EnableFeignClients
public class RewardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardsApplication.class, args);
	}
	
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**");
			}
		};
	}

}
