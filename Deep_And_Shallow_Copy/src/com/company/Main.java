package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat navi = new Cat();
        navi.setAge(new Age(2013,12));
        navi.setName("navi");
        //yo에 나비 , 이렇게 복사하면, navi이름도 yo가 된다. -> 동일한 주소값을 갖은 것이다.(얇은 복사)
        //Cat yo = navi;

        //이게 깊은 복사이다.
        Cat yo = navi.copy();
        yo.setName("yo");
        //이렇게 쓰면 문제가 없는데,
        //yo.setAge(new Age(2012,2));

        //이렇게 하면, 둘 다 같은 값이 나온다. 왜 이런 문제??
        //이 클래스 내부에 있는 Age 클래스 조차도 복사해서 주기 때문에 얇은 복사가 이루어지는 것이다.
        //그래서 우리는 copy에 가서 명시적으로 깊은 복사를 해주면 된다.
        yo.getAge().setYear(2020);

        System.out.println(navi.getName());
        System.out.println(yo.getName());
        //주소값이 같은 얇은 복사가 이루어진다.
        System.out.println(navi.getAge());
        System.out.println(yo.getAge());
        System.out.println(navi.getAge().getYear());
        System.out.println(yo.getAge().getYear());
    }
}
