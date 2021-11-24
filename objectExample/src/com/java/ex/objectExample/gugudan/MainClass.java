package com.java.ex.objectExample.gugudan;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단을 출력할 숫자를 입력 하시오.");
		int dan = sc.nextInt();
		
		Calculate cal = new Calculate();
		cal.Calculate(dan);
	}
}
