package com.company;

public interface IBeverage {
    /**
     * 총 가격의 책임을 가지고 있는 메서드
     * base 클래스가 구체적인 구현 부분
     */
    int getTotalPrice();
}
