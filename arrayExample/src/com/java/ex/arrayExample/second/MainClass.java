package com.java.ex.arrayExample.second;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		String[] ArrName = {"����", "����", "�ÿ�", "�ÿ�", "����"};
		int[] iArr = new int[5];
		int totalHeight = 0;	//ģ������ ������ ��
		int maxHeight = 0;		//���� ū ���
		int maxHeightIndex = 0;	//���� ū ����� �ε���
		int minHeight = 0;		//���� ���� ���
		int minHeightIndex = 0;	//���� ���� ����� �ε���
		
		//��ĳ�� Ŭ���� : Ŭ�����̸�  ��ü�̸� = new Ŭ�����̸�();
		Scanner sc = new Scanner(System.in);
		
		//iArr�� ���̸�ŭ �ݺ�
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(ArrName[i] + "ģ���� Ű�� �Է��Ͻÿ�(Cm) : ");
			iArr[i] = sc.nextInt();		//����� : �ڽ��� Ű(����) �Է�
			totalHeight = totalHeight + iArr[i];
		}
		//ģ������_������_�� / ArrName�迭��_����(ģ����_��) 
		System.out.println("ģ������ ��� ������" + (totalHeight / ArrName.length) + "Cm�Դϴ�.");	
		
		for(int i = 0; i < iArr.length; i++) {
			if(iArr[i] > maxHeight) {	//i��°�� ������� Ű�� maxHeight���� ũ�� 
				maxHeight = iArr[i];
				maxHeightIndex = i;
			}
		}
		System.out.println("ģ���� �� ���� ū �����" + ArrName[maxHeightIndex] + "�̰�, " + maxHeight + "Cm�Դϴ�.");
		
		minHeight = maxHeight;
		for(int i = 0; i < iArr.length; i++) {
			if(minHeight > iArr[i]) {
				minHeight = iArr[i];
				minHeightIndex = i;
			}
		}
		System.out.println("ģ���� �� ���� ���� �����" + minHeight + "Cm��" + ArrName[minHeightIndex] + "�Դϴ�.");
		
				
	}
}
