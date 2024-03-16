package com.rmkshr.medium.cmdrunner.controller;

import com.rmkshr.medium.cmdrunner.service.RsvpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RsvpController {

  @Autowired
  RsvpService rsvpService;

  @PostMapping
  public String getUserName() {
    return rsvpService.getUserName();
  }
}
