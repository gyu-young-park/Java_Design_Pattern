package com.company;

public class Age {
    //년,
    int year;
    // 나이,
    int value;

    public Age(int year, int value){
        this.value =value;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
