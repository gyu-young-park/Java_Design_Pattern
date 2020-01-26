package com.company;

public class Main {

    public static void main(String[] args) {
        //PrintMorseCode code = new PrintMorseCode(new DefaultMorseCode());
        //이제 사운드로 바꾸어주게 되면, 이렇게 구현체만 바꾸어주면 된다. -> 구현체만 만들어주고, 바꾸어 껴주기만 하면 된다.
        PrintMorseCode code = new PrintMorseCode(new SoundMorseCode());
        //체이닝으로 만들어주면 가독성이 좋다.
        code.g().a().r().a().m();

    }
}
