package com.company;

public class GameCharacter {
    //웨폰을 만든 것은 attack이라는 무기의 기능을 사용하기 위해서 이다.
    private Weapon weapon;
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    //내가 어떠한 것을 들고 있는지 에 따라서 기능이 달라진다.
    //누가 이 기능을 하는가?? delegate 다른 객체가 해준다.
    public void attack(){
        if(weapon ==  null){
            System.out.println("맨 손 공격");
        }else {
            weapon.attack();
        }
    }
}
