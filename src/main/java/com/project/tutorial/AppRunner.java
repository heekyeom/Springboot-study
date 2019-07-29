package com.project.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class AppRunner implements ApplicationRunner{

	@Autowired
	AuthorProperties properties;
	
	@Autowired
	String serverConfiguration;
	
	private Logger logger=LoggerFactory.getLogger(AppRunner.class); 
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("-----------------------");
		System.out.println(properties.getName());
		System.out.println(properties.getAge());
		System.out.println(properties.getSessionTimeout());
		System.out.println(serverConfiguration);
		System.out.println("-----------------------");
	}
}
