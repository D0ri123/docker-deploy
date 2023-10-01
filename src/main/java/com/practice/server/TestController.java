package com.practice.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/sample")
  public String hello() {
    return "I'm healthy";
  }

}
