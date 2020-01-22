package com.company;

public class Main {

    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        //청사진을 받는다. 즉, 모델을 받는 것
        factory.setBlueprint(new LGgram());

        //make를 하면 blueprint설계도에 따라 computer를 만든다.
        //그래서 blueprint, LGgram나 factory에 있을 수 있다. -> 정답은 없다. 어디든 그때그때에 따라 다르다.
        factory.make();
        Computer computer = factory.makeAndGet();
        System.out.println(computer.toString());

//        Computer computer = new Computer("i7","16g","256gb");
//        System.out.println(computer.toString());
        //그런데 지금은 간단하게 쓰지만, 실제적으로는 cpu , ram , 하드 또 computer자체가
        //굉장히 복잡한 단계로 구성되어 있어서 복잡한 단계를 거쳐야만 한다.
        //그래서 생성하는 단계를 main메서드에서 바로 쓴다면 매우 불편해질 것이다.
        //그래서 생성하는 객체를 하나만들어주자 그게 ComputerFactory
        //즉 모델마다 하드웨어들이 다 달라서 생성해주기 어렵다.
    }
}
