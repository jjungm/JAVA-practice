package com.java.ex.main;
//� �ڵ��� ����� �ѱ��� �̱��� �Ǹ� ��Ȳ

public class MainClass {
	public static void main(String[] args) {
		System.out.println("�ѱ����� �Ǹ� ��Ȳ");
		Motors kms = new KoreaMotor();
		kms.buyK3();
		kms.buyK5();
		kms.buyK7();
		kms.buySorento();
		kms.buySportage();
		
		System.out.println("================");
		
		System.out.println("�̱� ���� �Ǹ� ��Ȳ");
		Motors ums = new UsaMotor();
		ums.buyK3();
		ums.buyK5();
		ums.buyK7();
		ums.buySorento();
		ums.buySportage();
	}
}
