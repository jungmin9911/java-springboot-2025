package com.jm1109.spring04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);

		// 문자열, 시간타입 핸들링
		String String1 = "Hello";	// 일반적으로 사용
		System.out.println(String1);

		String String2 = new String("Hello");	// 기본
		System.out.println(String2);

		System.out.println(String1 == String2);	// 둘이 같은 주소를 쓰는 변수이닞 질문
		System.out.println(String1.equals(String2));	// 둘이 가지고 있는 데이터가 같은지

		String String3 = String2;	// String2의 주소를 String3에 대입

		System.out.println(String2 == String3);
		System.out.println(String2.equals(String3));

		// 문자여 메서드 연습
		String carstr = "avante, ionic, x3";
		String[] cars = carstr.split(", ");	// ,로 나누기
		for (String car : cars) {
			System.out.println(car);
		}

		for (String car : cars) {
			System.out.println(car.toUpperCase());	// 대문자로 변환
		}

		String caresult = carstr.replace(", ", "/");
		System.out.println(caresult);	// ,를 /로 변환
		String caresult2 = carstr.replaceAll(", ", " / "); 	// Java에서 ''는 Char
		System.out.println(caresult2);

		char[] charLst = String1.toCharArray();	// String을 Char로 변환
		for (char oneChar : charLst) {
			System.out.println(oneChar);
		}

		System.out.println(caresult.indexOf("io"));	// avante/ionic/x3의 위치는?
		System.out.println(caresult.lastIndexOf("n"));	// 9
		System.out.println(caresult.length());	// 15
	}

}
