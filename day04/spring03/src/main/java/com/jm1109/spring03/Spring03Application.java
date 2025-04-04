package com.jm1109.spring03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring03Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);

		// 컬렉션 프레임워크
		// List
		List<String> lst1 = new ArrayList<>();

		lst1.add("one");
		lst1.add("two");
		lst1.add("three");
		lst1.add("four");
		
		System.out.println(lst1);

		List<String> lst2 = new ArrayList<>();
		lst2.add("five");
		lst2.add("six");

		lst1.addAll(lst2);	// 다른 리스트 추가
		lst2.set(0, "Zero");

		System.out.println(lst1);
		System.out.println(lst1.get(5));

		List<Integer> lst3 = new LinkedList<>();
		lst3.add(10);
		lst3.add(20);
		lst3.add(30);
		System.out.println(lst3);

		// 정렬
		Collections.sort(lst1);	// 오름차순 정렬
		System.out.println(lst1);

		Collections.sort(lst1, Collections.reverseOrder());	// 내림차순 정렬
		System.out.println(lst1);

		// lst1.sort();	// 이 정렬 메서드 사용해도 무방

		System.out.println(lst1.contains("three"));	// 인덱스 찾기
		System.out.println(lst1.isEmpty());	// 리스트가 비어있는지 판별
		System.out.println(lst1.size()); 	// 배열 .length() 동일
		lst1.remove(5);	// 인덱스 삭제
		lst1.add("four");	// 인덱스 추가
		System.out.println(lst1);
		// !중요한 메서드
		// lst1.clear();	// 프로그램 종료시 리스트 비우기	// 함부로 쓰지말 것.

		// Vector
		Vector<String> vec1 = new Vector<>(10);	// 용량 저장 가능
		vec1.add("one");
		vec1.add("three");
		System.out.println("벡터 크기 -> " + vec1.size());
		System.out.println("벡터 용량 -> " + vec1.capacity());

		// Set
		Set<String> set1 = new HashSet<>();
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("four");
		set1.add("two");	// 중복된 값은 추가되지 않음

		System.out.println(set1);

		System.out.println(set1.contains("three"));	// 포함 여부 확인
		System.out.println(set1.isEmpty());	// 비어있는지 확인
		System.out.println(set1.size());	// 사이즈 확인
		set1.remove("four");	// 삭제
		set1.removeAll(set1);	// 모든 값 삭제
		// set1.clear();	// 모든 값 삭제
		set1.add("five");
		System.out.println(set1);

		// Map
		Map<String, String> phones = new HashMap<>();
		phones.put("010-1111-2222", "Galaxy S10");
		phones.put("010-2222-3333", "iPhone 14");
		phones.put("010-3333-4444", "Galaxy S24");
		phones.put("010-4444-5555", "iPhone 11");

		System.out.println(phones);

		System.out.println(phones.get("010-4444-5555"));	// 키값으로 값 찾기
		System.out.println(phones.values());	// 값만 가져오기
		System.out.println(phones.keySet());	// 키값만 가져오기
		System.out.println(phones.containsKey("010-1111-2222"));	// 키값으로 값 찾기
		System.out.println(phones.containsValue("iPhone 14"));	// 값으로 키값 찾기

		// 샘플 - 학생 네명의 국어, 영어, 수학, 미술, 체육 점수 합신/평균
		List<Integer> std1 = Arrays.asList(96, 100, 55, 80, 70);
		List<Integer> std2 = Arrays.asList(100, 100, 99, 95, 96);
		List<Integer> std3 = Arrays.asList(50, 50, 40, 100, 90);
		List<Integer> std4 = Arrays.asList(85, 85, 84, 86, 80);

		Map<String, List<Integer>> students = new HashMap<>();
		students.put("홍길동", std1);
		students.put("애슐리", std2);
		students.put("성유고", std3);
		students.put("김기윤", std4);

		Scanner scan = new Scanner(System.in);
		System.out.println("# 성적 조회할 학생 이름 입력 > ");
		String inName = scan.next();
		
		int sum = 0;
		for (int score : students.get(inName)) {
			sum += score;
		}

		System.out.println(inName + "학생의 성적 총점은 " + sum + ", 평균은 " + (sum / 5) + "입니다.");	
		
	}

}
