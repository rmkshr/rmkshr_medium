package com.rmkshr.medium.initbinder;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class MediumBinder {

  @InitBinder
  public void initBinder(WebDataBinder webDataBinder){
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
    dateFormat.setLenient(false);
    webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
  }


}
