package com.company;

import Abstract.Button;
import Abstract.GUIFactory;
import Abstract.TextArea;
import concrete.FactoryInstance;

public class Main {

    public static void main(String[] args) {
        //GUIFactory factory = new LinuxGUIFactory();
        //GUIFactory factory = new MacGUIFactoy();
        //위 처럼 매번 바꾸어 주는게 아니라
        //각 운영체제에 맞게 원하는 부분을 바꾸어 주는 것을 위해서 이렇게 만든다.
        //만약 맥에서 사용하는데, LinuxGUIFactory를 써주면 망하는 것이다.
        //어떤 환경에서 프로그램을 돌리던지, os와 관계없이 동작하도록 이렇게 만드는 것이다.
        GUIFactory factory = FactoryInstance.getGuiFac();
        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();
        button.click();
        System.out.println(textArea.getText());
    }
}
