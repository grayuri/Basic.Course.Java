package com.loiane.curso_java.aula_14_exercises;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Let me ask you some questions for this case.");
		int positiveQuestions = 0;
		
		System.out.println("First question: Did you phone for the victim?");
		boolean firstQuestion = scan.nextBoolean();
		if (firstQuestion == true) { ++positiveQuestions; }
		
		System.out.println("Second question: Did have you've been from the crime local?");
		boolean secondQuestion = scan.nextBoolean();
		if (secondQuestion == true) { ++positiveQuestions; }
		
		System.out.println("Third question: Did you leave close from the victim?");
		boolean thirdQuestion = scan.nextBoolean();
		if (thirdQuestion == true) { ++positiveQuestions; }
		
		System.out.println("Fourth question: Did you phone for the victim?");
		boolean fourthQuestion = scan.nextBoolean();
		if (fourthQuestion == true) { ++positiveQuestions; }
		
		System.out.println("Fifth question: Did you owe for the victim?");
		boolean fifthQuestion = scan.nextBoolean();
		if (fifthQuestion == true) { ++positiveQuestions; }
		
		System.out.println("Sixth question: Did you work for the victim?");
		boolean sixthQuestion = scan.nextBoolean();
		if (sixthQuestion == true) { ++positiveQuestions; }
		
		if (positiveQuestions == 2) { System.out.println("\"Hm... suspect.\""); }
		else if (positiveQuestions == 3 || positiveQuestions == 4) { System.out.println("\"Sou you are an accomplice.\""); }
		else if (positiveQuestions == 5 || positiveQuestions == 6) { System.out.println("Alright then. You have the right to remain silent."); }
		else { System.out.println("\"Is clearly an inocent.\""); } 
		
	}

}
