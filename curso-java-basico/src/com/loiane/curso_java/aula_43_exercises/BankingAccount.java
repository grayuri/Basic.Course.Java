package com.loiane.curso_java.aula_43_exercises;

public class BankingAccount {
	private String name;
	private int accountNumber;
	private double balance;
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void withdraw(Double value) {
		if (value > balance) {
			double necessaryValue = value - balance;
			System.out.println();
			System.out.println("You only have R$ " + balance + " in your account!");
			System.out.println("You need more R$ " + necessaryValue + " to do the transaction.");
		} else {			
			balance -= value;
		}
		
	}
	
	public void deposit(Double value) {
		balance += value;
	}
}
