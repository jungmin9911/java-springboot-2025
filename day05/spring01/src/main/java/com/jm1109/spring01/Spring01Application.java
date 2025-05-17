package com.jm1109.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		// StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append("Java");

		System.out.println(sb.toString());
		System.out.println(sb); // StringBuilder 객체만으로도 출력

		StringBuilder sb2 = new StringBuilder("Hi ");
		sb2.append("Jungmin");
		System.out.println(sb2.toString());
		// 리스트처럼 중간에 내용을 삽입가능
		sb2.insert(3, "Nice to meet you, ");
		System.out.println(sb2.toString());
		// 문자열 길이
		System.out.println(sb2.length());
		// 문자열 삭제
		sb2.delete(21, 28);	// 지울 시작 인덱스, 마지막 인덱스
		System.out.println(sb2.toString());
		// 인덱스 위치 문자 하나 삭제
		sb2.deleteCharAt(3);
		System.out.println(sb2.toString());

		// 문자열 거꾸로 변경
		System.out.println(sb2.reverse());
		// 원상복구
		sb2.reverse();

		// 문자열 대체
		sb2.replace(0, 1, "h");
		System.out.println(sb2.toString());

		// 문자열 자르기, 저장하려면 다른 변수에 값 할당
		System.out.println(sb2.substring(10).toString());
		System.out.println(sb2.toString());

		StringBuilder sb3 = new StringBuilder("  Hello  ");
		System.out.println(sb3);
		System.out.println(sb3.toString().trim()); // 앞뒤 공백 제거

		// StringBuffer
		StringBuffer sf = new StringBuffer();
		sf.append("Hullay, Java!");
		sf.insert(6, "C# and");
		System.out.println(sf.toString());
	}

}
