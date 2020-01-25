package concrete;

import Abstract.Button;
import Abstract.GUIFactory;
import Abstract.TextArea;
//이게 외부에 노출되어서는 안된다.
public class FactoryInstance {
    public static GUIFactory getGuiFac() {
        switch (getOsCode()){
            case 0: return new MacGUIFactoy();
            case 1: return new LinuxGUIFactory();
            case 2: return new WinGUIGFactory();
        }
        return null;
    }

    private static int getOsCode() {
        System.out.println(System.getProperty("os.name"));
        if(System.getProperty("os.name").equals("Windows 10")){
            return 2;
        }else if(System.getProperty("os.name").equals("Mac OS X")){
            return 0;
        }
        return 1;
    }
}

class LinuxGUIFactory  implements GUIFactory {


    @Override
    public Button createButton() {
        //여기에 리눅스 네이티브 소스가 들어간다
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}

class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("리눅스 버튼 클릭");
    }
}

class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "리눅스 텍스트 에어리어";
    }
}

class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac 버튼 클릭");
    }
}

class MacGUIFactoy implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}

class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "Mac 텍스트 에어리어";
    }
}

class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("윈도우 버튼 클릭");
    }
}


class WinGUIGFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}

class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "윈도우 텍스트 에어리어";
    }
}
