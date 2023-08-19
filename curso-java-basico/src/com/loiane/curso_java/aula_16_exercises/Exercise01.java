package com.loiane.curso_java.aula_16_exercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[5];
		int[] B = new int[5];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Type the "+ (i+1) +"o. integer number: ");
			A[i] = scan.nextInt();
			B[i] = A[i];
		}
			
		System.out.println("Array A:");
		for (int data : A) {
			System.out.print(data + ", ");
		}
		
		System.out.println("");
		
		System.out.println("Array B:");
		for (int data : B) {
			System.out.print(data + ", ");
		}
	}

}
