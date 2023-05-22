package com.example.solid.ocp.problem;

public class OpenClosedPrincipleDemo {
  public static void main(String[] args) {
    LoanHandler loanHandler = new LoanHandler();
    User user = new User();

    loanHandler.approveMortgageLoan(user);
    loanHandler.approvePersonalLoan(user);
  }
}
