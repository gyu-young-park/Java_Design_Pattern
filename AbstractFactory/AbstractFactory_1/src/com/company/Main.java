package com.company;

import Sam.SamCheonLeeBikeFactory;
import gt.GtBikeFactory;

public class Main {

    public static void main(String[] args) {
        //BikeFactory factory = new SamCheonLeeBikeFactory();
        BikeFactory factory = new GtBikeFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();
        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}
