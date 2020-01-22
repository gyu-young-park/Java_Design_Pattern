package com.company;


public class ComputerBulder {

    private Computer computer;
    private ComputerBulder(){
        computer = new Computer("default","default","default");
    }

    public static ComputerBulder start() {
        return new ComputerBulder();
    }

    public static ComputerBulder startWithCpu(String string){
        ComputerBulder computerBulder = new ComputerBulder();
        computerBulder.setCpu(string);
        return computerBulder;
    }

    public ComputerBulder setCpu(String string) {
        computer.setCpu(string);
        return this;
    }

    public ComputerBulder setRam(String string) {
        computer.setRam(string);
        return this;
    }

    public ComputerBulder setStorage(String string) {
        computer.setStorage(string);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
}
