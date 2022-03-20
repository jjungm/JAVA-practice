package com.spring.ex;

public class Student {
	private String name;
	private String age;
	private String gradeNum;
	private String classNum;
	 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getgradeNum() {
		return gradeNum;
	}
	public void setgradeNum(String gardeNum) {
		this.gradeNum = gardeNum;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	public Student(String name, String age, String gradeNum, String classNum) {
		this.age = age;
		this.classNum = classNum;
		this.gradeNum = gradeNum;
		this.name = name;
	}
	
}
