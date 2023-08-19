package com.loiane.curso_java.aula_35_exercises;

public class Calckies {
	public static double fibonacci(double number) {
		if (number < 2) {
			return 1;
		}
		
		return fibonacci(number - 1) + fibonacci(number - 2);
	}
	
	public static double summation(double number) {
		if (number == 1) {
			return 1;
		}
		
		return number + summation(number - 1);
	}
}
