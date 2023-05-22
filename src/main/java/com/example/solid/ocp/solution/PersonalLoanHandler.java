package com.example.solid.ocp.solution;

public class PersonalLoanHandler implements LoanHandler {
  Validator validator;

  public PersonalLoanHandler(Validator validator) {
    this.validator = validator;
  }

  @Override
  public void approveLoan(User user) {
    if (this.validator.isValid(user)) {
      System.out.println("Loan is approved");
    }
  }
}
