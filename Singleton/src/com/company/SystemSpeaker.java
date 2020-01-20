package com.company;

public class SystemSpeaker {
    //인스턴스를 여기에 new해서 만드는 게 아니라 getter에서 만든다.
    static private SystemSpeaker instance;
    private int volume;
    //생성자를 private로 만들어서 이 내부 외부에서는 생성하지 못하도록 만든다.
    private SystemSpeaker(){
        volume = 5;
    }

    public static SystemSpeaker getInstance(){
        if(instance == null){
            instance = new SystemSpeaker();
            //추가 사항
            System.out.println("새로 생성");
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
