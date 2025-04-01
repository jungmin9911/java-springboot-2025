package com.jm1109.spring03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring03Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);

		// for문 연습
		String names[] = {"홍길동", "김철수", "이영희", "박지민", "최민수"};

		int sum = 0;
		// 1부터 10까지 1씩 증가하면서 반복
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합: " + sum);

		// 배열, 컬렉션 반복
		// 첫번째 방법
		for (int i = 0; i < 5; i++) {
			System.out.print(names[i] + " > ");
		}
		System.out.println();

		// 두번째 방법
		for (String name : names) {
			System.out.print(name);
		}
	}

}
