package com.naga.medev.SpringDockerGitApp.SpringDockerGitApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sdga")
public class RestAPI {
	
	private Logger log=LoggerFactory.getLogger(RestAPI.class);
	
	@GetMapping("/hello")
	public String sayHello() {
		log.info("Inside say Hello ");
		return "Hello Welcome!!!";
	}

	@GetMapping("/gdate")
	public String getDate() {
		
		log.info("Inside get date");
		return "The date avaialble soon!!!";
	}

}
