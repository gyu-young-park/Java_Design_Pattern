package com.company;

public class LGgram extends BluePrint{

//    private Computer computer;
//
//    public LGgram() {
//        computer = new Computer("default","default","default");
//    }

    private String cpu;
    private String ram;
    private String storage;

    @Override
    public void setCpu() {
        //computer.setCpu("i7");
        cpu = "i7";
    }

    @Override
    public void setRam() {
        //computer.setRam("6g");
        ram = "8g";
    }

    @Override
    public void setStorage() {
        //computer.setStorage("256gb");
        storage ="256gb";
    }

    @Override
    public Computer getComputer() {
        return new Computer(cpu,ram,storage);
    }
}
