package entitites;

public class SavingsAccount extends Account{
	private Double interestRate;
	
	public SavingsAccount() {
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(Double amount) {
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "Number: " + number + "\n" +
				"Holder: " + holder + "\n" +
				"balance: " + balance;
	}

}
