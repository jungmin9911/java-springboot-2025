package com.jm1109.spring01;

public class Cat implements Animal {
    private String name; // 이름
    private int age; // 나이

    // 생성자
    Cat(String name, int age) {
        this.name = name; // Animal의 name을 Dog의 name으로 사용
        this.age = age; // Animal의 age를 Dog의 age로 사용
    }

    @Override
    public void cry() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'cry'");
        System.out.println(this.age + "살 " + this.name + "이(가) 웁니다. 야옹");
    }
    

}
