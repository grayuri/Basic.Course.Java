package com.loiane.curso_java.aula_36_exercises;

public class Student {
	private String name;
	private String status;
	private int enrollment;
	private double[] notes = new double[4];
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEnrollment() {
		return enrollment;
	}
	
	public void setEnrollment(int enrollment) {
		this.enrollment = enrollment;
	}
	
	public double[] getNotes() {
		return notes;
	}
	
	public void setNotes(double[] notes) {
		this.notes = notes;
	}
	
	public String getStatus() {
		String status = "";
		double media = getMedia();
		
		if (media >= 7) {
			status = "Approved";
		}
		else if (media < 7) {
			status = "Reproved";
		}
		
		this.status = status;
		
		return this.status;
	}
	
	public double getMedia() {
		double total = 0;
		double media = 0;
		
		for (int i = 0; i < notes.length; i++) { total += notes[i]; }
		
		media = total / notes.length;
		
		return media;
	}
	
}
