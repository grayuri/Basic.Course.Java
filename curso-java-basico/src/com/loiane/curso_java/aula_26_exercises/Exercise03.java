package com.loiane.curso_java.aula_26_exercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Student student = new Student();
		
		String name;
		int enrollment;
		String course;
		
		System.out.println("What's your name?");
		name = scan.next();
		
		System.out.println("What's your enrollment?");
		enrollment = scan.nextInt();
		
		System.out.println("What's your course?");
		course = scan.next();
		
		Student student = new Student(name, enrollment, course);
		
		String[] disciplines = student.getDisciplines();
		double[][] notes = student.getNotes();
		
		for (int i = 0; i < disciplines.length; i++) {
			System.out.println("What's your " + (i+1) + "o. discipline?");
			disciplines[i] = scan.next();
		}
		
		for (int i = 0; i < disciplines.length;) {	
			for (int j = 0; j < notes.length; j++, i++) {
				for (int k = 0; k < notes[j].length; k++ ) {					
					System.out.println("What's your " + (k+1) + "o. note of " + disciplines[i] + "?");
					notes[j][k] = scan.nextDouble();
				}
				
			}
		}
		
		boolean finishProgram = false;
		
		do {
			int choice = 0;
			
			System.out.println("Alright, " + name + ", what do you need?");
			System.out.println("[1] Get your detailed result");
			System.out.println("[2] Only get your result");
			System.out.println("[3] See notes");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: student.getDetailedResult(); break;
			case 2: student.getResult(); break;
			case 3: student.getNotesDetailed(); break;
			default: System.out.println("Invalid key! Try to type the number [1] or [2]."); break;
			}
			
		} while (!finishProgram);
	}

}
