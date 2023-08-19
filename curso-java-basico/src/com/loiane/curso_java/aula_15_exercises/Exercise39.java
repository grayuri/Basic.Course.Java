package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise39 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Let's take 5 students with their heights and names");
		
		double highest = Integer.MIN_VALUE;
		String highestName = "";
		
		double lowest = Integer.MAX_VALUE;
		String lowestName = "";
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("What's the name of the " + i + "o. student?");
			String name = scan.next();
			
			System.out.println("What's the height of the " + i + "o. student (in meters)?");
			double height = scan.nextDouble();
			
			if (height > highest) {
				highest = height;
				highestName = name;
			}
			else if (height < lowest) {
				lowest = height;
				lowestName = name;
			}
		}
		
		System.out.println("The highest student was " + highestName + " with " + highest + " m.");
		System.out.println("The lowest student was " + lowestName + " with " + lowest + " m.");
		
	}

}
