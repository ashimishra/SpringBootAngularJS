package com.websystique.springmvc.configuration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.websystique.springmvc.controller","com.websystique.springmvc.model","com.websystique.springmvc.service"})
public class Application extends SpringBootServletInitializer{
	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}
	
	/*@Override
	
	    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
	
	        return application.sources(Application.class);
	
	    }
*/

}
