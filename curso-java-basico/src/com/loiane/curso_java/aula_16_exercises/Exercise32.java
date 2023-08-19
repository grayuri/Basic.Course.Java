package com.loiane.curso_java.aula_16_exercises;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] A = new double[5];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Type the " + (1+i) + "o. of A:");
			A[i] = scan.nextDouble();
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.println();
			for (int j = 1; j <= 10; j++) {
				double multiplyResult = A[i] * j;
				System.out.println( A[i] + " x " + j + " = " + multiplyResult);
			}
		}
	}

}
