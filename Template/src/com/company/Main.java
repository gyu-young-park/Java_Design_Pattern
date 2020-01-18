package com.company;

import Auth.AbstGameConnectionHelper;
import Auth.DefaultGameConnectionHelper;

public class Main {
    public static void main(String[] args) {
	    AbstGameConnectionHelper helper = new DefaultGameConnectionHelper();
	    helper.requestConnection("아이디 암혹 등 접속 정보");
	    // 패키지를 나누었고, 각 단계 메서드가 protexted라서 conntection 등 알고리즘 스텝 메서드들이 안보인다.
    }
}
