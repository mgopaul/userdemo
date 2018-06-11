package com.mg.userdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

  @RequestMapping("/home")
  public String home() {
    System.out.println("Home ...!");
    return "index";
  }


}
