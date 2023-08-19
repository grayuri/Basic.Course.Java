package com.loiane.curso_java.aula_12;

import java.util.Scanner;

public class LeituraDadosTeclado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
//		System.out.println("Digite o seu nome completo: ");
//		String nomeCompleto = scan.nextLine();
//		System.out.println("Seu nome completo eh: " + nomeCompleto);
//		
//		System.out.println("Digite o seu primeiro nome: ");
//		String primeiroNome = scan.next();
//		System.out.println("Seu primeiro nome eh: " + primeiroNome);
		
		System.out.println("What's your first name?");
		String firstName = scan.next();
		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		
		System.out.println("How many childs you have?");
		int numberOfChilds = scan.nextInt();
		
		System.out.println("What's your height");
		float height = scan.nextFloat();
		
		System.out.println("Do you have any pet?");
		boolean havePet = scan.nextBoolean();
		
		System.out.println("- Your first name is " + firstName);
		System.out.println("- Your age is " + age);
		System.out.println("- You have " + numberOfChilds + " childs");
		System.out.println("- Your height is " + height);
		if (havePet == true) { System.out.println("- You have, at least, a pet."); } 
		else { System.out.println("- You don't have any pet."); };
		
	}
}



