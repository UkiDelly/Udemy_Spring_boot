package com.delly.rest.restful_web_servicies.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloWorldBean {
  private final String message;

  public HelloWorldBean(String message) {
    this.message = message;
  }
}
