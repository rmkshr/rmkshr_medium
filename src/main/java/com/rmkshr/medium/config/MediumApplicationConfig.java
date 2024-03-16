package com.rmkshr.medium.config;

import com.rmkshr.medium.cmdrunner.service.RsvpService;
import com.rmkshr.medium.cmdrunner.service.RsvpServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MediumApplicationConfig {

  @Bean
  public RsvpService rsvpService () {
    return new RsvpServiceImpl();
  }

}
