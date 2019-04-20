package com.ames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//for war
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


// for jar
@SpringBootApplication
public class AmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmesApplication.class, args);
	}

}


//for war
//@SpringBootApplication
//public class AmesApplication extends SpringBootServletInitializer {
//
//    public static void main(String[] args) {
//        SpringApplication.run(AmesApplication.class, args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(AmesApplication.class);
//    }
//}










