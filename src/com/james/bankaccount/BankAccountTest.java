package com.james.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount test = new BankAccount();
		test.deposit(100, "checking");
		test.deposit(100, "savings");
		test.getAllMoney();
		test.withdraw(50, "checking");
		test.getBothAccAmounts();
		test.getAllAccounts();
	}

}
