package com.java.ex.arrayExample.second;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		String[] ArrName = {"남일", "보검", "시영", "시연", "수지"};
		int[] iArr = new int[5];
		int totalHeight = 0;	//친구들의 신장의 합
		int maxHeight = 0;		//가장 큰 사람
		int maxHeightIndex = 0;	//가자 큰 사람의 인덱스
		int minHeight = 0;		//가장 작은 사람
		int minHeightIndex = 0;	//가장 작은 사람의 인덱스
		
		//스캐너 클래스 : 클래스이름  객체이름 = new 클래스이름();
		Scanner sc = new Scanner(System.in);
		
		//iArr의 길이만큼 반복
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(ArrName[i] + "친구의 키를 입력하시오(Cm) : ");
			iArr[i] = sc.nextInt();		//사용자 : 자신의 키(정수) 입력
			totalHeight = totalHeight + iArr[i];
		}
		//친구들의_신장의_합 / ArrName배열의_길이(친구의_수) 
		System.out.println("친구들의 평균 신장은" + (totalHeight / ArrName.length) + "Cm입니다.");	
		
		for(int i = 0; i < iArr.length; i++) {
			if(iArr[i] > maxHeight) {	//i번째의 사용자의 키가 maxHeight보다 크면 
				maxHeight = iArr[i];
				maxHeightIndex = i;
			}
		}
		System.out.println("친구들 중 가장 큰 사람은" + ArrName[maxHeightIndex] + "이고, " + maxHeight + "Cm입니다.");
		
		minHeight = maxHeight;
		for(int i = 0; i < iArr.length; i++) {
			if(minHeight > iArr[i]) {
				minHeight = iArr[i];
				minHeightIndex = i;
			}
		}
		System.out.println("친구들 중 가장 작은 사람은" + minHeight + "Cm인" + ArrName[minHeightIndex] + "입니다.");
		
				
	}
}
