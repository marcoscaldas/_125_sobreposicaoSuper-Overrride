package application;          // _125_ classes e metodo final

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

	Account acc1 = new Account(1001, "alex", 1000.0);
	acc1.withdraw(200.0);
	System.out.println(acc1.getBalance());
		
	Account acc2 = new SavingsAccount(1003,"Maria", 1000.0, 0.01);
	acc2.withdraw(200.0);
	System.out.println(acc2.getBalance());
	
	Account acc3 = new BusinessAccount(10036, "Bob", 1000.0, 500.0);
	acc3.withdraw(200.0);
	System.out.println(acc3.getBalance());
	
	}
}