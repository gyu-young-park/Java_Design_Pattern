package com.company;

public class AObj {
    Ainterface ainterface;

    public AObj(){
        ainterface = new AInterfaceImplements();
    }

    public void funcAA(){
        //다음의 기능이 필요한 코드가 필요하다고 하자
//        System.out.println("AAA");
//        System.out.println("AAA");
        //그 기능을 할 수 있는 코드가 넣어져야 한다. ainterface라 있다고하자
        ainterface.funcA();
        ainterface.funcA();

    }
}
