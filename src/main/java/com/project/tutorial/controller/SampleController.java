package com.project.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.tutorial.service.SampleService;

@RestController
public class SampleController {
	
	@Autowired
	SampleService sample_service;
	
	@GetMapping("/hello")
	public String hello() {
		return sample_service.getHello();
	}
}
