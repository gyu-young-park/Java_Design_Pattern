package com.company;

abstract  public class Component {
    //파일 이름
    private String name;

    public Component(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
