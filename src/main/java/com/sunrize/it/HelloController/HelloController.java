package com.sunrize.it.HelloController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunrize.it.config.AppProperties;

@RestController
public class HelloController {

	private final AppProperties appProperties;

	public HelloController(AppProperties appProperties) {
		this.appProperties = appProperties;
	}

	@Cacheable
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("Executing hello API logic...");
		return appProperties.getMessage();
	}

}
