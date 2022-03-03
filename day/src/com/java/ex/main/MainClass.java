package com.java.ex.main;

//계산기 ( left, right, sum, arg)m
class Calculation {
	int left, right;

	public void set(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

}

public class MainClass {
	public static void main(String[] args) {
		Calculation ca = new Calculation();
		ca.set(10, 30);
		ca.sum();
		ca.avg();
		
		Calculation cal = new Calculation();
		cal.set(15, 5);
		cal.sum();
		cal.avg();
	}
}
