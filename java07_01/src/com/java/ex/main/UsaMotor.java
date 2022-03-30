package com.java.ex.main;

public class UsaMotor extends Motors {
	public UsaMotor() {
	}

	@Override
	public void buyK3() {
		System.out.println("K3취급X");
	}

	@Override
	public void buyK5() {
		System.out.println("K5 취급X");
	}

	@Override
	public void buyK7() {
		System.out.println("K7 취급X");
	}

	@Override
	public void buySportage() {
		System.out.println("스포티지 : 2000만원");
	}

	@Override
	public void buySorento() {
		System.out.println("소렌토 취급X");

	}
}
