package com.cocepts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pojo.Employee;

@Configuration
public class HelloWorldConfig {
   @Bean 
   public Employee helloWorld(){
      return new Employee();
   }
}