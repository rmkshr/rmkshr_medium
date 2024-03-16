package com.rmkshr.medium;

import com.rmkshr.medium.cmdrunner.service.RsvpService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MediumApplication {

  public static void main(String[] args) {
    SpringApplication.run(MediumApplication.class, args);
  }

	@Bean
  CommandLineRunner lookupRsvpService(RsvpService rsvpService) {
    return args -> rsvpService.getUserName();
  }

	//Other uses may include
	//Database initialisation : To initialise database and add initial data
	//Cache Preheating : Fetch data from DB and load it into the cache
	//Loading external resources : Read config data and warm it up so it is ready when needed.
  //Logging : App startup time, resource consumed at startup etc.
  //Task Initialisation : Anything that needed to be done at startup.
  //Component Initialisation : Add multiple cmd runner and line them up with @Order annotation.
  
}
