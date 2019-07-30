package com.project.tutorial;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class SpringboottutorialApplicationTests {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void hello() throws Exception {	    
		mockMvc.perform(get("/hello"))
		.andExpect(status().isOk())
		.andExpect(content().string("hi hello"));
	}
	
	@Test
	public void createUser_JSON() throws Exception {
		String userJson = "{\"username\" : \"saelobi\", \"password\":\"123\"}";
		mockMvc.perform(post("/users/create")
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.content(userJson))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.username", is(equalTo("saelobi"))))
		.andExpect(jsonPath("$.password", is(equalTo("123"))));
	}
	
	@Test
	public void createUser_XML() throws Exception{
		String userJson = "{\"username\" : \"saelobi\", \"password\":\"123\"}";
		mockMvc.perform(post("/users/create")
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.accept(MediaType.APPLICATION_XML)
				.content(userJson))
		.andExpect(status().isOk())
		.andExpect(xpath("/User/username").string("saelobi"))
		.andExpect(xpath("/User/password").string("123"));
	}

}
