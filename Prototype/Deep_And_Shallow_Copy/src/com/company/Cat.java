package com.company;

public class Cat implements Cloneable {
    private String name;
    private Age age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Age getAge() {
        return age;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat cat = (Cat) this.clone();
        //명시적으로 깊은 복사를 시켜주는 것이다.
        cat.setAge(new Age(this.age.getYear(),this.age.getValue()));
        return cat;
    }
}
