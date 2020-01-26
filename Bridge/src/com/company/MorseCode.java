package com.company;

public class MorseCode {
    //이걸 추후에 추가한 것이다.
    private MorseCodeRootFunc morseCodeRootFunc;

    public MorseCode(MorseCodeRootFunc morseCodeRootFunc){
        this.morseCodeRootFunc = morseCodeRootFunc;
    }

    public void setMorseCodeRootFunc(MorseCodeRootFunc morseCodeRootFunc) {
        this.morseCodeRootFunc = morseCodeRootFunc;
    }

    public void dot(){
        morseCodeRootFunc.dot();
    }
    public void dash(){
        morseCodeRootFunc.dash();
    }
    public void space(){
        morseCodeRootFunc.space();
    }
}
