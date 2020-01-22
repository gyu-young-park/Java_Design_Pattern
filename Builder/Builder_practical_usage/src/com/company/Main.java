package com.company;

public class Main {

    public static void main(String[] args) {
        //이렇게 만들면, 생성자가 너무 많아서 헷갈리는 경우가 생긴다. 바로 아래와 같은 경우이다.
        //Computer computer = new Computer("256g","i7","23");
        Computer computer = ComputerBulder
                .start()
                .setCpu("i7")
                .setRam("8g")
                .setStorage("256g ssd")
                .build();
        System.out.println(computer.toString());



        //자바 문법 공부, this를 리턴하면 해당 객체의 주소값과 같은 것을 리턴할 수 있다.
        //단, static 메서드는 this 를 리턴할 수 없다.
        ComputerBulder cs = ComputerBulder.startWithCpu("cpw");
        System.out.println(cs);
        System.out.println(cs.setRam("dw"));

    }
}
