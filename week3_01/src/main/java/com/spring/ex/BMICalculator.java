package com.spring.ex;

public class BMICalculator {
	private double lowWeight;	
	private double overWeight;
	private double normal;
	private double obesity;
	
	public void bmiCalculation(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h * h);
		System.out.println("bmil����  :" + (int)result);
		if(result > obesity) {
			System.out.println("���Դϴ�.");
		}else if(result > obesity) {
			System.out.println("������ �Դϴ�.");
		}else if(result > normal) {
			System.out.println("���� �Դϴ�.");
		}else {
			System.out.println("��ü�� �Դϴ�.");
		}
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
}
