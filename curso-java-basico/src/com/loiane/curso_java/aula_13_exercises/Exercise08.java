package com.loiane.curso_java.aula_13_exercises;

import java.lang.Math;
import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many hours you work for day?");
		double hoursOfWork = scan.nextDouble();
		
		System.out.println("How many cash you earn per hour?");
		double cashPerHour = scan.nextDouble();
		
		int daysOfWork = 30;
		
		double salary = daysOfWork * hoursOfWork * cashPerHour;
		
		System.out.println("So your salary per month is R$ " + salary);
	}

}
