package com.project.tutorial;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringboottutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottutorialApplication.class, args);
		SpringApplication application = new SpringApplication(SpringboottutorialApplication.class);
//		application.addListeners(new AppStartingSampleListener());
		System.out.println("start spring boot tutorial");
		application.run(args);
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
    @Bean
    public ServletWebServerFactory serveltContainer(){
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
        return tomcat;
    }

    private Connector createStandardConnector(){
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(8081);
        return connector;
    }



}
