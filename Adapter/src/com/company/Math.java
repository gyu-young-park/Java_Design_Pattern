package com.company;

public class Math {
    //이미 구현되어 있지만, Double이다.
    public static double twoTime(double num){
        return num*2;
    }
    public static double half(double num){
        //기존에 있던, 즉, 사용하던 half 함수에 대가 로그를 찍는 로직을 넣으면
        //이 기존 함수를 쓰고 있던 다른 사람들은 원치 않게 해당 로그를 보게 된다.
        //그래서 implements에 대가 해준다.
        //System.out.println("helf 호출");
        return num/2;
    }


    public static Double doubled(Double d){
        return d*2;
    }


}
