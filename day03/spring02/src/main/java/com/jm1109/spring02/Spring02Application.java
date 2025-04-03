package com.jm1109.spring02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);

		int result = 0;

		// 예외처리
		try {
			result = 17 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println(result);

		String[] names = {"Alice", "Bob", "Charlie"};
		try {
			System.out.println(names[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		System.out.println("프로그램 종료");
	}

}
