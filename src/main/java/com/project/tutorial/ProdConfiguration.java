package com.project.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
public class ProdConfiguration {

	@Bean
	public String hello() {
		return "prod configuration!!!";
	}
}
