package com.tspringmvc.services;

import com.tspringmvc.entity.User;

import java.util.ArrayList;
import java.util.List;

//UserDao
//@Service
public class UserService {
  private List<User> userList = new ArrayList<>();

  public List<User> findAll() {
    return userList;
  }

  public void save(User user) {
    userList.add(user);
  }

  public void delete(Long id) {
    for (User u : userList) {
      if (u.getId().equals(id)) {
        userList.remove(u);
      }
    }
  }
}
