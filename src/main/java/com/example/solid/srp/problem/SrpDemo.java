package com.example.solid.srp.problem;

import com.example.solid.srp.Role;
import com.example.solid.srp.User;

public class SrpDemo {
  public static void main(String[] args) {
    MailBoxSettingService mailBoxSettingService = new MailBoxSettingService();
    User user = new User();
    user.setId(111);
    user.setRole(Role.ADMIN);

    mailBoxSettingService.changeSecondaryEmail(user, "newEmail@gmail.com");

    if (mailBoxSettingService.hasAccess(user)) {
      user.sendMoney(user, 300);
    }
  }
}
