package entitites;

public class Account {
	
	protected Integer number;
	protected String holder;
	protected Double balance;
	
	public Account() {
	}


	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}

//	public void setBalance(Double balance) {
//		this.balance = balance;
//	}

	public void withdraw(Double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}

	@Override 
	
	public String toString() {
		return "Number: " + number + "\n" +
				"Holder: " + holder + "\n" +
				"balance: " + balance;
	}

	
	
}
