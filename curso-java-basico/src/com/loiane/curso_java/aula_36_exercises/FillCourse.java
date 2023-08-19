package com.loiane.curso_java.aula_36_exercises;

import java.util.Scanner;

public class FillCourse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Course course = new Course();
		Teacher teacher = new Teacher();
		Student[] students = new Student[5];
		
		System.out.println("What's the name of the course?");
		course.setName(scan.next());
		
		System.out.println();
		System.out.println("What's the shift of the course?");
		course.setShift(scan.next());
		
		System.out.println();
		System.out.println("What's the teacher of the course?");
		teacher.setName(scan.next());
		
		System.out.println();
		System.out.println("What's the departament of the teacher?");
		teacher.setDepartament(scan.next());
		
		System.out.println();
		System.out.println("What's the email of the teacher?");
		teacher.setEmail(scan.next());
		
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			
			System.out.println();
			System.out.println("What's the name of the " + (i+1) + "o. student?");
			student.setName(scan.next());
			
			System.out.println();
			System.out.println("What's the enrollment of " + student.getName() + "?");
			student.setEnrollment(scan.nextInt());
			
			double[] studentNotes = new double[student.getNotes().length];
			for (int noteSt = 0; noteSt < student.getNotes().length; noteSt++) {				
				System.out.println();
				System.out.println("What's the " + (noteSt+1) + "o. note of " + student.getName() + "?");
				studentNotes[noteSt] = scan.nextDouble();
			}
			student.setNotes(studentNotes);	
			students[i] = student;
		}
		
		course.setTeacher(teacher);
		course.setStudents(students);
		
		System.out.println();
		System.out.println("Here's the unified informations that I received: ");
		System.out.println("[ - About the Course - ] ");
		System.out.println(".Name: " + course.getName());
		System.out.println(".Shift: " + course.getShift());
		
		System.out.println();
		System.out.println("[ - About the Teacher - ] ");
		System.out.println(".Name: " + course.getTeacher().getName());
		System.out.println(".Departament: " + course.getTeacher().getDepartament());
		System.out.println(".Email: " + course.getTeacher().getEmail());
		
		System.out.println();
		System.out.println("[ - About the Students - ] ");
		for (int i = 0; i < course.getStudents().length; i++) {
			System.out.println("- " + (i+1) + "o. Student: ");
			System.out.println(".Name: " + course.getStudents()[i].getName());
			System.out.println(".Enrollment: " + course.getStudents()[i].getEnrollment());
			System.out.println(".Status: " + course.getStudents()[i].getStatus());
			System.out.println();
		}
		
	}

}
