package com.company;

public class PrintMorseCode extends MorseCode {
    public PrintMorseCode(MorseCodeRootFunc morseCodeRootFunc) {
        super(morseCodeRootFunc);
    }

    //알파벳을 모스 부호대로 만들어 주자
    public PrintMorseCode g(){
        dash();dash();dot();space();
        return this;
    }
    public PrintMorseCode a(){
        dot();dash();space();
        return this;
    }
    public PrintMorseCode r(){
        dot();dash();dot();space();
        return this;
    }
    public PrintMorseCode m(){
        dash();dash();space();
        return this;
    }
}
