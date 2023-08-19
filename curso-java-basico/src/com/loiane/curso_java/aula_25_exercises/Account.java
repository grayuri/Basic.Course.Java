package com.loiane.curso_java.aula_25_exercises;

public class Account {

	String user;
	int balance;
	boolean type;
	
	double realizeServe(double money) {
		balance += money;
		
		return balance;
	}
	
	double depositMoney(double money) {
		balance -= money;
		
		return balance;
	}
	
	double getBalance() {
		return balance;
	}
	
	String getType() {
		String typeAccount = "";
		
		if (type == true) {
			typeAccount = "Special";
		}
		else {
			typeAccount = "Standart";
		}
		
		return typeAccount;
	}
}
