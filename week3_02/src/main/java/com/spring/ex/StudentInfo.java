package com.spring.ex;

public class StudentInfo {
	private Student student;
	
	public StudentInfo(Student student) {
		this.student = student;
	}
	
	void getStudentInfo() {
		if(student != null) {
			System.out.println("�̸� : " + student.getName());
			System.out.println("���� : " + student.getAge());
			System.out.println("�г� : " + student.getgradeNum());
			System.out.println("~��: " + student.getClassNum());
		}
	}
	private void setStudent(Student student) {
		this.student = student;

	}
}
