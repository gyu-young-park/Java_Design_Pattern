package com.company;
/**
 * component의 실질적인 책임 부분이다.
**/
public class Base implements IBeverage{

    //아무것도 없는 상태는 0을 준다.
    @Override
    public int getTotalPrice() {
        return 0;
    }
}
