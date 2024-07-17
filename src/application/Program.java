package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Account;
import entitites.BusinessAccount;
import entitites.SavingsAccount;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Account account = new Account(10, "Alex", 500.0);
		account.withdraw(200.0);
		System.out.println(account.getBalance());
	
		Account c2 = new SavingsAccount(1010, "Alexia", 500.0, 90.0);
		c2.withdraw(50.0);
		System.out.println(c2.getBalance());
		
		Account c3 = new BusinessAccount(1011, "Juka", 600.0, 0.01);
		c3.withdraw(45.6);
		System.out.println(c3.getBalance());
	}
}
