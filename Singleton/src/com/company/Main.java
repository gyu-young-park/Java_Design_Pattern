package com.company;

public class Main {

    public static void main(String[] args) {
        //private라서 안될 것이다. 그래서 static으로 선언된 메서드만 불러와보자
//        SystemSpeaker speaker = new SystemSpeaker();
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        //둘다 같은 볼륨값을 가지게 된다.
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(20);

        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker2.setVolume(30);

        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        System.out.println(speaker1.toString());
        System.out.println(speaker2.toString());
    }
}
