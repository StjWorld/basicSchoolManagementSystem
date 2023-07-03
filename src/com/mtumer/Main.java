package com.mtumer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nl = System.lineSeparator();
		
		StudentManagementSystem sms = new StudentManagementSystem();
		Scanner scanner = new Scanner(System.in);
		boolean runMe = true;

		System.out.println("Student Management System Menu:"+nl
				+"***********************"+nl+"Number of total students: "
				+nl+"***********************");

		sms.totalStudent = scanner.nextInt();

		while(runMe) {
		
			System.out.println(
					"Main Menu: " + nl +
					"***************************"+nl+
					"1. Add new student."+nl+
					"2. List all students."+nl+
					"3. Exit."+nl+
					"***************************"
					);
			int choiceOne = (0);
			try {
				choiceOne = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Wrong entry type!");
			}
			
			switch(choiceOne) {
			case 3:
				scanner.close();
				runMe=false;
				break;
			case 1:
				System.out.println("You will add new student."+nl+
						"You can add up to "+sms.totalStudent+" students.");
				Student newStudent = new Student();
				System.out.println("Name: ");
				String name = scanner.next();
				newStudent.setName(name);
				System.out.println("Roll Number: ");
				int rollNumber = scanner.nextInt();
				newStudent.setRollNumber(rollNumber);
				System.out.println("English Marks: ");
				int marksEnglish = scanner.nextInt();
				newStudent.setMarksEnglish(marksEnglish);
				System.out.println("Math Marks: ");
				int marksMath = scanner.nextInt();
				newStudent.setMarksMath(marksMath);
				System.out.println("Science Marks: ");
				int marksScience = scanner.nextInt();
				newStudent.setMarksScience(marksScience);
				sms.addStudent(newStudent);
				break;
				
			case 2:
				sms.displayStudentInfo();
				break;
			default:
				System.out.println("Wrong entry!");
			}
		}
	}
}
