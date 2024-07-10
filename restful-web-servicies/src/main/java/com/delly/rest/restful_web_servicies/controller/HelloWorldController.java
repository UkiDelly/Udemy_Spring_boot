package com.delly.rest.restful_web_servicies.controller;

import com.delly.rest.restful_web_servicies.domain.HelloWorldBean;
import com.delly.rest.restful_web_servicies.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

  @GetMapping
  public String helloWorld() {
    return "Hello World";
  }

  @GetMapping("/bean")
  public HelloWorldBean helloWorldBean() {
    return new HelloWorldBean("Hello World");
  }

  @GetMapping("/{name}")
  public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {

    return new HelloWorldBean("Hello World, " + name + "!");
  }
}
