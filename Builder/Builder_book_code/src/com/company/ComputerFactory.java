package com.company;

public class ComputerFactory {
    private BluePrint print;
    public void setBlueprint(BluePrint print){
        this.print = print;
    }

    public void make() {
        print.setCpu();
        print.setRam();
        print.setStorage();
    }

    public Computer makeAndGet() {
        return print.getComputer();
    }
}
