package com.company;

public class SoundMorseCode implements MorseCodeRootFunc {
    @Override
    public void dot() {
        System.out.print("닷");
    }

    @Override
    public void dash() {
        System.out.print("삐");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
