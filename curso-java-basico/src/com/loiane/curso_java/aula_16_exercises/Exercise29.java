package com.loiane.curso_java.aula_16_exercises;

import java.util.Scanner;

public class Exercise29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[10];
		int[] C = new int[20];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Type the " + (1+i) + "o. number of A: ");
			A[i] = scan.nextInt();
			C[i] = A[i];
		}
		
		for (int i = 0; i < B.length; i++) {
			System.out.println("Type the " + (1+i) + "o. number of B: ");
			B[i] = scan.nextInt();
			C[i + A.length] = B[i];
		}
		
		for (int i = 0; i < A.length; i++) {
			if (i == 0) {	System.out.print("A: [ " + A[i] + ", ");	}
			else if (i == A.length - 1) { System.out.print(A[i] + " ]"); }
			else {	System.out.print(A[i] + ", ");	}
		}
		
		System.out.println();
		
		for (int i = 0; i < B.length; i++) {
			if (i == 0) {	System.out.print("B: [ " + B[i] + ", ");	}
			else if (i == B.length - 1) { System.out.print(B[i] + " ]"); }
			else {	System.out.print(B[i] + ", ");	}
		}
		
		System.out.println();
		
		for (int i = 0; i < C.length; i++) {
			if (i == 0) {	System.out.print("C: [ " + C[i] + ", ");	}
			else if (i == C.length - 1) { System.out.print(C[i] + " ]"); }
			else {	System.out.print(C[i] + ", ");	}
		}
	}

}
