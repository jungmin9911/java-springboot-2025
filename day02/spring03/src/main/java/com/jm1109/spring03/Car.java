package com.jm1109.spring03;

public class Car {
	public String name;
	public int year;
	private String company;	// private은 같은 클래스 내에서만 접근 가능

	public void printCarName() {
		System.out.println("차 이름은 " + name);
	}

	// 메서드 오버로딩
	// 같은 데이터타입은 안 됨 (?)
	public void printCarName(String point) {
		System.out.println("차 이름은 " + name + "포인트는 " + point);
	}

	// 가변인자
	public void printCarName(String... name) {
		for (String n : name) {
			System.out.println(n);
		}
	}

	int calcYear(int currYear) {
		return currYear - year;
	}

	public static void printYear() {
		System.out.println("2020년");
	}
}
