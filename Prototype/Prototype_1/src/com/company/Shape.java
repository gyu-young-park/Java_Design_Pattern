package com.company;

public class Shape implements Cloneable {
    private String id; //shape의 객체 아이디,

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
