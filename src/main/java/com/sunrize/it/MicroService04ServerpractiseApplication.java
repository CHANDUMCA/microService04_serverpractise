package com.sunrize.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class MicroService04ServerpractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroService04ServerpractiseApplication.class, args);
	}

}
