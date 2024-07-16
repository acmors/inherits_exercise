package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Account;
import entitites.BusinessAccount;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Account account = new Account(10, "Alex", 0.0);
		BusinessAccount bAccount = new BusinessAccount(15, "Maria", 0.0, 60.0);
		
		//UpCasting => basicamente atribuir um objeto BusinessAccount(filho) para uma variável do tipo Account(pai)
		Account account2 = bAccount;
		//tambem pode ser feito assim:
		Account account3 = new BusinessAccount(16, "João", 0.0, 70.0);
		
		//DownCasting => processo inverso, converter objeto da superClasse para subClasse
		BisunessAccount bAccount2 = 
	}
}
