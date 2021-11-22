package com.java.ex.arrayExample.first;

public class MainClass {
	public static void main(String[] args) {
		int[] iArr = {10, 20, 30, 40, 50};
		
		//리스트를 0-4까지 출력한 후 tab만큼 이동
		for(int i = 0; i < 5; i++) {
			System.out.println(iArr[i] + "\t");
		}
		
		System.out.println("");		
		
		//새로운 배열 크기 설정 후 배열 값 선언
		int[] jArr = new int[3];	
		jArr[0] = 0;	
		jArr[1] = 1;
		jArr[2] = 2;
		
		for(int j = 0; j < 3; j++) {
			System.out.println(jArr[j] + "\t");;
		}
	}
}
