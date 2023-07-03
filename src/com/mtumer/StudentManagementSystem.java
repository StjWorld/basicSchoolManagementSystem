package com.mtumer;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
	int totalStudent;
	
	String nl = System.lineSeparator();
	private List<Student> students;
	
	public StudentManagementSystem() {
		this.students = new ArrayList<>();

	}
	
	public void addStudent(Student student) {

		if (students.size() < totalStudent){
			students.add(student);
		}else {
			System.out.println("maximum number of students in system!");
		}

		
	}
	
	private static int marksCalc(int a, int b, int c) {
		return (a+b+c)/3;
	}
	

	private static String gradeCalc(int a, int b, int c) {
		int avgMarks = marksCalc(a,b,c);
		if (avgMarks >=90) {
			return "A";
		}else if (avgMarks >=80) {
			return "B";
		}else if (avgMarks >=70) {
			return "C";
		}else if (avgMarks >=60) {
			return "D";
		}
		return "F";
		
	}
	
	public void displayStudentInfo() {
		for (Student student: students) {
			System.out.println("************************"+nl+
					"Student Name: " +student.getName()+nl
			+"Roll Number: " + student.getRollNumber()+nl
			+ "Average Marks: "+ marksCalc(student.getMarksEnglish(),
					student.getMarksMath(), student.getMarksScience())+nl
			+ "Grade: " +gradeCalc(student.getMarksEnglish(),
					student.getMarksMath(),
					student.getMarksScience())+nl+"************************");
		}
	}

}
