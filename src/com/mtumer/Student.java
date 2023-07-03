package com.mtumer;

public class Student {
	
	private String name;
	private int rollNumber;
	private int marksEnglish;
	private int marksMath;
	private int marksScience;
	
	//default constructor
	public Student() {}
	
	//constructor
	public Student(String name, int rollNumber, int marksEnglish, int marksMath, int marksScience) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marksEnglish = marksEnglish;
		this.marksMath = marksMath;
		this.marksScience = marksScience;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRollNumber() {
		return rollNumber;
	}



	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}



	public int getMarksEnglish() {
		return marksEnglish;
	}



	public void setMarksEnglish(int marksEnglish) {
		this.marksEnglish = marksEnglish;
	}



	public int getMarksMath() {
		return marksMath;
	}



	public void setMarksMath(int marksMath) {
		this.marksMath = marksMath;
	}



	public int getMarksScience() {
		return marksScience;
	}



	public void setMarksScience(int marksScience) {
		this.marksScience = marksScience;
	}

}
