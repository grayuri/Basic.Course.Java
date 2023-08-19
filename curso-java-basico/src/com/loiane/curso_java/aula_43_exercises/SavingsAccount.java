package com.loiane.curso_java.aula_43_exercises;

public class SavingsAccount extends BankingAccount {
	private String incomeDay;
	
	public double getCalculatedNewBalance(Double value) {
		double incomeRate = (6.17) / 100;
		double calculatedValue = value + (value * incomeRate);
		
		return calculatedValue;
	}
}
