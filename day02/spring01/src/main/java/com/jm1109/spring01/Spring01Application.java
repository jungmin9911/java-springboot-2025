package com.jm1109.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		// while문
		int num = 10;

		while (num >= 0) {
			System.out.println(num);
			num--;
		}

		System.out.println("while문 종료");

		// do-while문 - 조건에 맞지 않아도 한번은 실행됨
		int count = 1;
		do {
			System.out.println(count);
			count++;
		} while (count <= 10);

		System.out.println("do-while문 종료");

		// break, continue
		num = 1;
		while (num < 11) {
			if (num % 2 == 0) {
				num++;	// num을 1씩 감소
				break;	// if문 조건이 참이면 반복문을 빠져나감
				// continue; // if문 조건이 참이면 빠져나가서 반복문 위로 올라감
			}

			System.out.println(num);
			num++;
		}

		System.out.println("break/continue 종료");
	}

}
