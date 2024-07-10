package com.delly.rest.restful_web_servicies.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;


// User DAO (Data Access object)
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class User {

  private Long id;

  private String name;

  private LocalDate birthDate;

}
