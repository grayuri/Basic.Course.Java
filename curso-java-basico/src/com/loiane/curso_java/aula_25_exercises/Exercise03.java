package com.loiane.curso_java.aula_25_exercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("What's your name?");
		student.name = scan.next();
		
		System.out.println("What's your enrollment?");
		student.enrollment = scan.nextInt();
		
		System.out.println("What's your course?");
		student.course = scan.next();
		
		for (int i = 0; i < student.disciplines.length; i++) {
			System.out.println("What's your " + (i+1) + "o. discipline?");
			student.disciplines[i] = scan.next();
		}
		
		for (int i = 0; i < student.disciplines.length;) {	
			for (int j = 0; j < student.notes.length; j++, i++) {
				for (int k = 0; k < student.notes[j].length; k++ ) {					
					System.out.println("What's your " + (k+1) + "o. note of " + student.disciplines[i] + "?");
					student.notes[j][k] = scan.nextDouble();
				}
				
			}
		}
		
		boolean finishProgram = false;
		
		do {
			int choice = 0;
			
			System.out.println("Alright, " + student.name + ", what do you need?");
			System.out.println("[1] Get your detailed result");
			System.out.println("[2] Only get your result");
			System.out.println("[3] See notes");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: student.getDetailedResult(); break;
			case 2: student.getResult(); break;
			case 3: student.getNotes(); break;
			default: System.out.println("Invalid key! Try to type the number [1] or [2]."); break;
			}
			
		} while (!finishProgram);
		
	}

}
