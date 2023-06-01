package com.example.solid.srp.problem;

import com.example.solid.srp.Role;
import com.example.solid.srp.User;

public class MailBoxSettingService {
  public void changeSecondaryEmail(User user, String email) {
    if(hasAccess(user)) {
      user.setSecondaryEmail(email);
    }
  }

  public boolean hasAccess(User user) {
    return user.getRole() == Role.ADMIN;
  }
}
