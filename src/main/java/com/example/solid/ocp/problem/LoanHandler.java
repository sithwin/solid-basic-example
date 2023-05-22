package com.example.solid.ocp.problem;

public class LoanHandler {
  private PersonalLoanValidator personalLoanValidator;
  private MortgageLoanValidator mortgageLoanValidator;

  public void approvePersonalLoan(User user) {
    if (personalLoanValidator.isValidPersonalLoan(user)) {
      System.out.println("Personal Loan is Approved");
    }
  }

  public void approveMortgageLoan(User user) {
    if(mortgageLoanValidator.isValidForMortgageLoan(user)) {
      System.out.println("Mortgage Loan is approved");
    }
  }
}
