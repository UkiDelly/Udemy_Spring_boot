package com.delly.rest.restful_web_servicies.service;

import com.delly.rest.restful_web_servicies.domain.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoService {

  private static final List<User> users = new ArrayList<>();

  static {
    users.add(new User(1L, "Adam", LocalDate.of(1991, 1, 1)));
    users.add(new User(2L, "Eve", LocalDate.of(1992, 2, 2)));
    users.add(new User(3L, "Jack", LocalDate.of(1993, 3, 3)));
  }

  public List<User> findAll() {
    return users;
  }

  public User save(User user) {
    if (user.getId() == null) {
      user.setId((long) (users.size() + 1));
    }
    users.add(user);
    return user;
  }

}
