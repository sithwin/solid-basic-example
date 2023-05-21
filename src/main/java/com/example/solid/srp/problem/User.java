package com.example.solid.srp.problem;

public class User {
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPrimaryEmail() {
    return primaryEmail;
  }

  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }

  public String getSecondaryEmail() {
    return secondaryEmail;
  }

  public void setSecondaryEmail(String secondaryEmail) {
    this.secondaryEmail = secondaryEmail;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  private int id;
  private String primaryEmail;
  private String secondaryEmail;
  private Role role;

  public void sendMoney(User userTo, int dollarsAmount) {
    System.out.println("Money Send to " +  userTo.id + ": " + dollarsAmount);
  }
}
