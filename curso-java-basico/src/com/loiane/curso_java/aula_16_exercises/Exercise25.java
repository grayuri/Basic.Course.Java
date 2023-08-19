package com.loiane.curso_java.aula_16_exercises;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] A = new double[10];
		double[] B = new double[10];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Type a number for A: ");
			A[i] = scan.nextDouble();
			
			
			if (A[i] % 2 == 0) { B[i] = 1; } 
			else { B[i] = 0; }
			
		}
	}

}
