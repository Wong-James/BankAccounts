package com.james.bankaccount;

public class BankAccount {
	private double checking;
	private double savings;
	private static int accountsMade;
	private static double allMoney;
	
	public BankAccount() {
		accountsMade++;
	}
	
	public double getChecking() {
		return checking;
	}
	
	public double getSavings() {
		return savings;
	}
	public double getBothAccAmounts() {
		System.out.println("Checking amount: " + checking);
		System.out.println("Savings amount: " + savings);
		return checking + savings;
	}
	public int getAllAccounts() {
		System.out.println("Number of accounts made: " + accountsMade);
		return accountsMade;
	}
	
	public double getAllMoney() {
		System.out.println("All money available: " + allMoney);
		return allMoney;
	}
	
	public void deposit(double deposit, String accountType) {
		if (accountType.equals("checking")){
			checking += deposit;
			allMoney += deposit;
			System.out.println("Checkings deposit amount: " + checking);
		}
		else if(accountType.equals("savings")) {
			savings += deposit;
			allMoney += deposit;
			System.out.println("Savings deposit amount: " + savings);
		}
		
	}
	
	public void withdraw(double withdraw, String accountType) {
		if (accountType.equals("checking")){
			if (checking < withdraw) {
				System.out.println("Insufficient funds");
			}
			else {
				checking -= withdraw;
				allMoney -= withdraw;
				System.out.println("Checkings withdraw amount: " + checking);
				
			}
		}
		else if(accountType.equals("savings")) {
			if(savings < withdraw) {
				System.out.println("Insufficient funds");
			}
			else {
				savings -= withdraw;
				allMoney -= withdraw;
				System.out.println("Savings withdraw amount: " + savings);
			}
		}
		
	}

	
}
