package com.java.ex.arrayExample.first;

public class MainClass {
	public static void main(String[] args) {
		int[] iArr = {10, 20, 30, 40, 50};
		
		//����Ʈ�� 0-4���� ����� �� tab��ŭ �̵�
		for(int i = 0; i < 5; i++) {
			System.out.println(iArr[i] + "\t");
		}
		
		System.out.println("");		
		
		//���ο� �迭 ũ�� ���� �� �迭 �� ����
		int[] jArr = new int[3];	
		jArr[0] = 0;	
		jArr[1] = 1;
		jArr[2] = 2;
		
		for(int j = 0; j < 3; j++) {
			System.out.println(jArr[j] + "\t");;
		}
	}
}
