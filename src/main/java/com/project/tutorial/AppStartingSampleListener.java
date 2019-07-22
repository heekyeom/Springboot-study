package com.project.tutorial;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartingSampleListener implements ApplicationListener<ApplicationStartingEvent>{
	
	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("==========================");
		System.out.println("spring starting event");
		System.out.println("==========================");
	}

}
