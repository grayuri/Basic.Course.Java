package com.loiane.curso_java.aula_16_exercises;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[10];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Type the " + (i+1) + "o. number of A:");
			A[i] = scan.nextInt();
			B[B.length - 1 - i] = A[i]; 
		}
		
		System.out.println("");
		
		for (int i = 0; i < A.length; i++) {
			if (i == 0) {	System.out.print("A: " + A[i]);	}
			else {	System.out.print(A[i]);	}
		}
		
		System.out.println("");
		
		for (int i = 0; i < B.length; i++) {
			if (i == 0) {	System.out.print("B: " + B[i]);	}
			else {	System.out.print(B[i]);	}
		}
	}

}
