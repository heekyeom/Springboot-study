package com.project.tutorial;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("author")
public class AuthorProperties {
	
	@NotEmpty
	private String name;
	
	private int age;
	
	@DurationUnit(ChronoUnit.SECONDS)
	private Duration sessionTimeout=Duration.ofSeconds(30);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Duration getSessionTimeout() {
		return sessionTimeout;
	}

	public void setSessionTimeout(Duration sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}	
}