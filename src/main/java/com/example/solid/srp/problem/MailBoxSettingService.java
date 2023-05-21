package com.example.solid.srp.problem;

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
