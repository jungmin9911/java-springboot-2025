package com.jm1109.spring05;

import java.lang.Object;    // Object는 자바의 최상위 클래스 !! 모든 클래스는 Object를 상속받음
// 부모클래스 동물
public class Animal {
    // String name; // public 등 쓰지 않으면 default로 설정됨. 같은 패키지에서만 사용 가능 !!
    // public String name; // public
    private String name; // private 외부에서 접근 불가 !! (제일 심함 !!)
    // protected String name; // protected 같은 패키지에서만 사용 가능 !! (private보다 잘 안 씀..)
    private int age;
    
    public int getAge() {
        return age;
    }   // getter는 별로 변경할 거 없음. setter는 많음

    // 정확한 캡슐화를 위해서 필터링
    public void setAge(int age) {
        // 음수나 너무 큰 수가 들어가지 않도록 막아줌
        if (age <= 0) {
            this.age = 1; // 음수 막기
        } else if (age > 20) {
            this.age = 20; // 너무 큰 수 막기
        } else {
            this.age = age; // 정상적인 나이
        }
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void cry() {
        System.out.println(this.name + "이(가) 웁니다.");
    }

}
