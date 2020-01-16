package com.company;

public class Main {

    public static void main(String[] args) {

        //인터페이스
        Ainterface ainterface = new AInterfaceImplements();
        ainterface.funcA();

        //delegate
        AObj aObj = new AObj();
        aObj.funcAA();

        //strategy
        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.attack();
        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();
        gameCharacter.setWeapon(new Sword());
        gameCharacter.attack();
        gameCharacter.setWeapon(new Ax());
        gameCharacter.attack();
    }
}
