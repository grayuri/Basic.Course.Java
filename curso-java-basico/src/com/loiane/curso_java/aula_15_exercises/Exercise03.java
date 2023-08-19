package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type your name:");
		String name;
		boolean validName = false;
		
		do {
			name = scan.nextLine();
			if(name.length() >= 3) { validName = true; }
			else { System.out.println("You need to set a name with, at least, 3 carachters."); }
			
		} while (!validName);
		
		// ---------- // ---------- // ---------- // ---------- // ---------- // ---------- //
		
		System.out.println("Type your age:");
		int age;
		boolean validAge = false;
		
		do {
			age = scan.nextInt();
			if(age >= 0 && age <= 150) { validAge = true; }
			else { System.out.println("You need to set an age between 0 and 150."); }
			
		} while (!validAge);
		
		// ---------- // ---------- // ---------- // ---------- // ---------- // ---------- //
		
		System.out.println("Type your salary:");
		double salary;
		boolean validSalary = false;
		
		do {
			salary = scan.nextDouble();
			if(salary > 0 ) { validSalary = true; }
			else { System.out.println("You need to set a salary higher than zero."); }
			
		} while (!validSalary);
				
		// ---------- // ---------- // ---------- // ---------- // ---------- // ---------- //
		
		System.out.println("What's your gender:");
		System.out.println("[M]ale");
		System.out.println("[F]emale");
		String gender;
		boolean validGender = false;
		
		do {
			gender = scan.next();
			
			switch(gender) {
			case "M": validGender = true; gender = "Male"; break;
			case "m": validGender = true; gender = "Male"; break;
			case "F": validGender = true; gender = "Female"; break;
			case "f": validGender = true; gender = "Female"; break;
			default: System.out.println("You need to set an gender like \"M\" or \"F\"."); break;
			}
			
		} while (!validGender);
		
		// ---------- // ---------- // ---------- // ---------- // ---------- // ---------- //
		
		System.out.println("What's your civil state:");
		System.out.println("[S]ingle");
		System.out.println("[M]arried");
		System.out.println("[W]idow");
		System.out.println("[D]ivorced");
		String civilState;
		boolean validCivilState = false;
		
		do {
			civilState = scan.next();
			
			switch(civilState) {
			case "S": validCivilState = true; civilState = "Single"; break;
			case "s": validCivilState = true; civilState = "Single"; break;
			case "M": validCivilState = true; civilState = "Married"; break;
			case "m": validCivilState = true; civilState = "Married"; break;
			case "W": validCivilState = true; civilState = "Widow"; break;
			case "w": validCivilState = true; civilState = "Widow"; break;
			case "D": validCivilState = true; civilState = "Divorced"; break;
			case "d": validCivilState = true; civilState = "Divorced"; break;
			default: System.out.println("You need to set an gender like \"S\", \"M\", \"W\" or \"D\"."); break;
			}
			
		} while (!validCivilState);
		
		System.out.println("Here is your document:");
		System.out.println("- Name: " + name);
		System.out.println("- Age: " + age);
		System.out.println("- Salary: " + salary);
		System.out.println("- Gender: " + gender);
		System.out.println("- Civil State: " + civilState);
	}

}
