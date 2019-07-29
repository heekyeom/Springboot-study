package com.project.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test")
@Component
public class TestConfiguration {
	
	@Bean
	public String hello() {
		return "test Configuration!!!";
	}
}
