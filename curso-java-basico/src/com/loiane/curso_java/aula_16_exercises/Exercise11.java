package com.loiane.curso_java.aula_16_exercises;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int evenNumbers = 0;
		
		for (int i = 0; i < A.length; i++) { 
			System.out.println("Type the " + (i+1) + "o. number of A: ");
			A[i] = scan.nextInt();
			
			if (A[i] % 2 == 0) { evenNumbers++; }
		}
		
		System.out.print("These are the elements of A: ");
		for (int i = 0; i < A.length; i++) { 
			if (i == A.length - 1) {
				System.out.println(A[i]);
			} else {				
				System.out.print(A[i] + ", "); 
			}
		}
		
		System.out.println("There are " + evenNumbers + " even number in array A.");
	}

}
