package com.jm1109.spring01;

public interface Animal {
    // public String name = "이름";
    // public int age = 1;

    void cry();     // 내부구현이 없음 (추상메서드)

    // 메서드 구현이 들어갈 수 있음
    public default void introduce() {
        System.out.println("저는 동물이에요.");
    }
}
