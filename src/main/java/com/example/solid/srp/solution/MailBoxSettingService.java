package com.example.solid.srp.solution;

import com.example.solid.srp.User;

public class MailBoxSettingService {
  private final UserAccess userAccess;

  public MailBoxSettingService(UserAccess userAccess) {
    this.userAccess = userAccess;
  }
  public void changeSecondaryEmail(User user, String email) {
    if(userAccess.hasAccess(user)) {
      user.setSecondaryEmail(email);
    }
  }
}
