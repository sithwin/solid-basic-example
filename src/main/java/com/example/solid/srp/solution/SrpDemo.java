package com.example.solid.srp.solution;

import com.example.solid.srp.Role;
import com.example.solid.srp.User;

public class SrpDemo {
  public static void main(String[] args) {
    UserAccess userAccess = new UserAccess();
    MailBoxSettingService mailBoxSettingService = new MailBoxSettingService(userAccess);
    User user = new User();
    user.setId(111);
    user.setRole(Role.ADMIN);

    mailBoxSettingService.changeSecondaryEmail(user, "newEmail@gmail.com");

    if (userAccess.hasAccess(user)) {
      user.sendMoney(user, 300);
    }
  }
}
