package com.company;
//BluePrint 는 해당 메서드 작업들이 필요하다는 것을 써주는 것이다.

public abstract class BluePrint {
    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();
    abstract public Computer getComputer();
}
