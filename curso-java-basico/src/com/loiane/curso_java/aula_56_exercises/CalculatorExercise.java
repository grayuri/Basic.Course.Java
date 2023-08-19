package com.loiane.curso_java.aula_56_exercises;

import java.util.Scanner;

public class CalculatorExercise {

	public enum Operations {
		SUM("+") {
			public double calculateOperations(double x, double y) {
				return x + y;
			}
		}, 
		
		SUBTRACT("-") {
			public double calculateOperations(double x, double y) {
				return x - y;
			}
		}, 
		
		DIVISION("/") {
			public double calculateOperations(double x, double y) {
				return x / y;
			}
		}, 
		
		MULTIPLY("*") {
			public double calculateOperations(double x, double y) {
				return x*y;
			}
		};
		
		private String operator;
		
		Operations (String operator) {
			this.operator = operator;
		}
		
		public String toString() {
			return this.operator;
		}
		
		public abstract double calculateOperations(double x, double y);
	}
	
	public static void main(String[] args) {
		double x = 2;
		double y = 5;
		
		Operations sumOperation = Enum.valueOf(Operations.class, "SUM");
		Operations subtracOperation = Enum.valueOf(Operations.class, "SUBTRACT");
		Operations divisionOperation = Enum.valueOf(Operations.class, "DIVISION");
		Operations multiplyOperation = Enum.valueOf(Operations.class, "MULTIPLY");
		
		System.out.println(x + " " + sumOperation + " " + y + " = " + sumOperation.calculateOperations(x, y));
		System.out.println(x + " " + subtracOperation + " " + y + " = " + subtracOperation.calculateOperations(x, y));
		System.out.println(x + " " + divisionOperation + " " + y + " = " + divisionOperation.calculateOperations(x, y));
		System.out.println(x + " " + multiplyOperation + " " + y + " = " + multiplyOperation.calculateOperations(x, y));
		
		System.out.println();
		
		for (Operations op : Operations.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.calculateOperations(x, y));
		}
	}
	
}
