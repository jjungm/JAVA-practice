package com.java.ex.objectExample.gugudan;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� ����� ���ڸ� �Է� �Ͻÿ�.");
		int dan = sc.nextInt();
		
		Calculate cal = new Calculate();
		cal.Calculate(dan);
	}
}
