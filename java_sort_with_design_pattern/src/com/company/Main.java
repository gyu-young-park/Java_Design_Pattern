package com.company;

import Sort.*;

public class Main {

    public static void main(String[] args) {
        Sortter sortter = new Sortter(HeapSort.getInstance(10));
        sortter.sort();
        System.out.println(sortter.getAlgorithmName());
    }
}
