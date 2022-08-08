package com.abc.model;

public class Assessment_2_Student {
	int rollno;
	String name,
        String standard;
String dob;
	double fees;
	
	
	
	
	public Assessment_2_Student(int rollno, String name, String standard, String dob, double fees) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.standard = standard;
		this.dob = dob;
		this.fees = fees;
	}
	public Assessment_2_Student() {
		
	}
	public int getRoll() {
		return rollno;
	}
	public void setRoll(int roll) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
}
