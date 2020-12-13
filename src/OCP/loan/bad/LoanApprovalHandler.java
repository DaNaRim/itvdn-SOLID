package OCP.loan.bad;

public class LoanApprovalHandler {

    public void approveLoan(PersonalLoanValidator validator) {
        if (validator.isValid()) {
            //Process of the loan
        }
    }

    public void approveLoan(VehicleLoanValidator validator) {
        if (validator.isValid()) {
            //Process of the loan
        }
    }
}

class PersonalLoanValidator {

    public boolean isValid() {
        //validation logic
        return true;
    }
}

class VehicleLoanValidator {

    public boolean isValid() {
        //validation logic
        return true;
    }
}