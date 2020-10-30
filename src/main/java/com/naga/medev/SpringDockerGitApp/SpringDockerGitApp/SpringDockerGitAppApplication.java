package com.naga.medev.SpringDockerGitApp.SpringDockerGitApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringDockerGitAppApplication {

	static private Logger log=LoggerFactory.getLogger(SpringDockerGitAppApplication.class);
	public static void main(String[] args) {
		log.info("starting main application");
		SpringApplication.run(SpringDockerGitAppApplication.class, args);
		log.info("Ended main application");
	}

}
