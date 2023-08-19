package com.loiane.curso_java.aula_16_exercises;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[20];
		int[] B = new int[20];
		int posB = 0;
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Type the " + (1+i) + "o. of A:");
			A[i] = scan.nextInt();
		}
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				B[posB] = A[i];
				posB++;
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 != 0) {
				B[posB] = A[i];
				posB++;
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < B.length; i++) {
			if (i == 0) {	System.out.print("B: [ " + B[i] + ", ");	}
			else if (i == B.length - 1) { System.out.print(B[i] + " ]"); }
			else {	System.out.print(B[i] + ", ");	}
		}
	}

}
