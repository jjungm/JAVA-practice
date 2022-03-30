package com.java.ex.main;
//어떤 자동차 기업의 한국과 미국의 판매 현황

public class MainClass {
	public static void main(String[] args) {
		System.out.println("한국지사 판매 현황");
		Motors kms = new KoreaMotor();
		kms.buyK3();
		kms.buyK5();
		kms.buyK7();
		kms.buySorento();
		kms.buySportage();
		
		System.out.println("================");
		
		System.out.println("미국 지사 판매 현황");
		Motors ums = new UsaMotor();
		ums.buyK3();
		ums.buyK5();
		ums.buyK7();
		ums.buySorento();
		ums.buySportage();
	}
}
