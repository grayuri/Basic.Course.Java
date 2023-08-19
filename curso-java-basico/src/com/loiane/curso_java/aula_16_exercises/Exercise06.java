package com.loiane.curso_java.aula_16_exercises;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[10];
		int[] C = new int[10];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Type the "+ (i+1) + "o. number of A: ");
			A[i] = scan.nextInt();
			
			System.out.println("Type the "+ (i+1) + "o. number of B: ");
			B[i] = scan.nextInt();
			
			C[i] = A[i] + B[i];
		}
		
		System.out.print("The values of C are: ");
		for (int data : C) { System.out.print(data + ", " ); }
	}

}
