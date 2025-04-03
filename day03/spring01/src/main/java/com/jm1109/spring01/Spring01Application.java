package com.jm1109.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		// 인터페이스 연습
		Dog ppoppy = new Dog("뽀삐", 12);
		Dog kitty = new Dog("키티", 8);

		ppoppy.introduce();
		ppoppy.cry();
		kitty.introduce();
		kitty.cry();
	}

}
