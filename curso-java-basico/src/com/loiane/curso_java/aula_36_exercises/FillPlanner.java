package com.loiane.curso_java.aula_36_exercises;

import java.util.Scanner;

public class FillPlanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Planner planner = new Planner();
		Contact[] contacts = new Contact[3];
		
		System.out.println("Hello there! what's your name?");
		String username = scan.next();
		
		for (int i = 0; i < contacts.length; i++) {
			Contact contact = new Contact();
			System.out.println();
			System.out.println("What's the name of the " + (i+1) + "o. contact?");
			String name = scan.next();
			contact.setName(name);
			
			System.out.println();
			System.out.println("What's the main phone number of " + name + "?");
			String phone = scan.next();
			contact.setNumber(phone);
			
			System.out.println();
			System.out.println("What's the main email of " + name + "?");
			String email = scan.next();
			contact.setEmail(email);
			
			contacts[i] = contact;
		}
		
		planner.setContacts(contacts);
		
		if (planner != null && planner.getContacts() != null) {
			System.out.println();
			System.out.println("Alright, " + username + " that's the contacts that you have storage in your planner:");
			
			Contact[] c = planner.getContacts();
			
			for (int i = 0; i < c.length; i++) {
				System.out.println();
				System.out.println("- " + (i+1) + "o. Contact");
				System.out.println(".Name: " + c[i].getName());
				System.out.println(".Phone Number: " + c[i].getNumber());
				System.out.println(".Email: " + c[i].getEmail());
			}
		}
		
		
	}

}
