package com.loiane.curso_java.aula_34_exercises;

public class Calculator {
	private double number;
	private double total;
	 
	public void clear() {
		number = 0;
		total = 0;
	}
	
	public void setTotal(double number) {
		this.total += number;
	}
	
	public void setNumber(double number) {
		this.number = number;
	}
	
	public double getTotal() {
		return total;
	}
	
	public double sum() {
		return total += number;
	}
	
	public double subtract() {
		return total -= number;
	}
	
	public double multiply() {
		return total *= number;
	}
	
	public double divide() {
		return total /= number;
	}
	
	public double getSquared() {
		return total = Math.pow(total, 2);
	}
	
	public double getSquareRoot() {
		return total = Math.sqrt(total);
	}
	
	public double getFactorial() {
		double factorial = 1;
		for (int i = 1; i <= total; i++) { factorial *= i; }
		return total = factorial;
	}
}
