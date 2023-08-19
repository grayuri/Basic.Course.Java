package com.loiane.curso_java.aula_25_exercises;

public class Student {
	String name;
	int enrollment;
	String course;
	String[] disciplines = new String[3];
	double[][] notes = new double[3][4];
	String status;
	
	void getDetailedResult() {
		double[] notesAmount = new double[3];
		double[] notesMedia = new double[3];
		String approvedDisciplines = "";
		String reprovedDisciplines = "";
		int reprovationsCount = 0;
 		
		for (int i = 0; i < disciplines.length;) {
			for (int j = 0; j < notes.length; j++, i++) {
				for (int k = 0; k < notes[j].length; k++) {					
					notesAmount[i] += notes[j][k];
				}
				notesMedia[j] = notesAmount[j] / 4;
				
				if (notesMedia[j] >= 7) {
					approvedDisciplines += ("." + disciplines[i] + "\n");
				}
				else if (notesMedia[j] < 7) {
					reprovedDisciplines += ("." + disciplines[i] + "\n");
					reprovationsCount++;
				}
			}
		}
		
		System.out.println("You are approved in: \n" + approvedDisciplines);
		
		if (reprovationsCount > 1) {
			System.out.println("But are reproved in: \n" + reprovedDisciplines);
			status = "Reproved";
		}
		else {
			status = "Approved";
		}
		
		System.out.println("That is, you're " + status);
	}
	
	void getResult() {
		double[] notesAmount = new double[3];
		double[] notesMedia = new double[3];
		int reprovationsCount = 0;
 		
		for (int i = 0; i < disciplines.length;) {
			for (int j = 0; j < notes.length; j++, i++) {
				for (int k = 0; k < notes[k].length; k++ ) {					
					notesAmount[j] += notes[j][k];
				}
				notesMedia[j] = notesAmount[i] / 4;

				if (notesMedia[j] < 7) {
					reprovationsCount++;
				}
			}
		}
		
		if (reprovationsCount > 1) {
			status = "Reproved";
		}
		else {
			status = "Approved";
		}
		System.out.println("You're " + status);
	}

	void getNotes() {
		for (int i = 0; i < disciplines.length;) {
			for (int j = 0; j < notes.length; j++, i++) {
				System.out.print(disciplines[i] + ": ");
				for (int k = 0; k < notes[j].length; k++) {					
					
					if (k == notes[j].length - 1) {
						System.out.print(notes[j][k] + ". \n");
					} else {						
						System.out.print(notes[j][k] + ", ");
					}
				}
			}
		}
	}
}
