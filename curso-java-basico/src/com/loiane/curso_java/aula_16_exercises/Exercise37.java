package com.loiane.curso_java.aula_16_exercises;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[5];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Type the " + (1+i) + "o. number of A:");
			A[i] = scan.nextInt();
		}
		
		int[] Fac = new int[A.length];
		
		for (int i = 0; i < Fac.length; i++) {
			int firstNumber = 1;
			int secondNumber = 0;
			Fac[i] = 1;
			
			for (int j = A[i]; j > 1 ; j--) {
				firstNumber = j;
				secondNumber = firstNumber;
				Fac[i] *= secondNumber;
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			if (i == 0) {	System.out.print("A: [ " + A[i] + ", ");	}
			else if (i == A.length - 1) { System.out.print(A[i] + " ]"); }
			else {	System.out.print(A[i] + ", ");	}
		}
		
		System.out.println();
		
		for (int i = 0; i < Fac.length; i++) {
			if (i == 0) {	System.out.print("Fac: [ " + Fac[i] + ", ");	}
			else if (i == Fac.length - 1) { System.out.print(Fac[i] + " ]"); }
			else {	System.out.print(Fac[i] + ", ");	}
		}
	}

}
