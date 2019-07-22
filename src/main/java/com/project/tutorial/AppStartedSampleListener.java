package com.project.tutorial;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartedSampleListener implements ApplicationListener<ApplicationStartedEvent>{
	
	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		System.out.println("==========================");
		System.out.println("spring started event");
		System.out.println("==========================");
	}

}
