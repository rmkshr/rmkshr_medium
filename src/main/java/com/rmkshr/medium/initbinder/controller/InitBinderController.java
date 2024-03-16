package com.rmkshr.medium.initbinder.controller;

import java.util.Date;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitBinderController {

  @PostMapping("/create")
  public String createUser(@RequestParam String name, @RequestParam Date dateOfBirth) {
    // Your logic to create a user with the provided name and date of birth
    System.out.println(dateOfBirth);
    return name + " was born on " + dateOfBirth;
  }

  @InitBinder
  public void dateInitBinder(@RequestParam (value = ("name"), required = false) String name) {
    System.out.println("INITBINDER+++++++++++   " + name);
    if (name.length() < 5) {
      throw new IllegalArgumentException("Please enter full name");
    }
  }


}
