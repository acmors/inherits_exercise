package entitites;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if (amount <= loanLimit) {
			balance += loanLimit - 10.0;
		}else {
			System.out.println("The requested amount surpasses the available loan limit for your account.");
		}
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	public String toString() {
		return "Number: " + number + "\n" +
				"Holder: " + holder + "\n" +
				"balance: " + balance + "\n" +
				"Loan Limit: " + loanLimit;
	}

	
}
