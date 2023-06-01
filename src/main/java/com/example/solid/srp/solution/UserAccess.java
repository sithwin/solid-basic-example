package com.example.solid.srp.solution;

import com.example.solid.srp.Role;
import com.example.solid.srp.User;

public class UserAccess {
  public boolean hasAccess(User user) {
    return user.getRole() == Role.ADMIN;
  }
}
