package com.student;

public class Student{
    private int rollNo;
    private String name;
    private String city;
    public Student(int rollNo,String name, String city)
    {
    	this.rollNo=rollNo;
    	this.city=city;
    	this.name=name;
    }
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
  
}
