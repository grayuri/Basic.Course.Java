package com.loiane.curso_java.aula_16_exercises;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] firstNote = new double[10];
		double[] secondNote = new double[10];
		double[] media = new double[10];
		String[] result = new String[10];
		
		System.out.println("Let's calculate their notes and medias.");
		
		for (int i = 0; i < media.length; i++) {
			System.out.println("What's the first note of the " + (i+1) + "o. student?");
			firstNote[i] = scan.nextDouble();
			
			System.out.println("What's the second note of the " + (i+1) + "o. student?");
			secondNote[i] = scan.nextDouble();
			
			media[i] = (firstNote[i] + secondNote[i]) / 2; 
			
			if (media[i] >= 7) { result[i] = "Approved"; }
			else { result[i] = "Reproved"; }
		}
		
		
		for (int i = 0; i < media.length; i++) {
			System.out.println("");
			System.out.println((i+1) + "o. student:");
			System.out.println(".First Note - " + firstNote[i]); 
			System.out.println(".Second Note - " + secondNote[i]); 
			System.out.println(".Media - " + media[i]);
			System.out.println(".Result - " + result[i]);
		}
	}

}
