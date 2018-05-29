package com.keyholesoftware.beandef.example.lazyloading.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.keyholesoftware.beandef.example.lazyloading.model.ClassA;
import com.keyholesoftware.beandef.example.lazyloading.model.ClassB;
import com.keyholesoftware.beandef.example.lazyloading.model.ClassC;

//@Lazy  use lazy here to make all beans lazy load...
@Configuration
@ComponentScan(basePackages = "com.keyholesoftware.beandef.example.lazyloading")
public class AppConfig {
    
	@Lazy // this makes ClassA lazy
    @Bean
    public ClassA createA() {
        return new ClassA();
    }
    
    @Bean
    public ClassB createB() {
        return new ClassB();
    }
    
    @Bean
    public ClassC createC() {
        return new ClassC();
    }
     
}