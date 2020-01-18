package Auth;

public abstract class AbstGameConnectionHelper {
    //알고리즘의 단계이기 때문에 노출되어서는 안된다. private로 선언한다??
    //안된다. 하위 클래스가 재정의를 해야하는데, private로 해주면 안된다.
    //그래서 protected를 사용해야 한다.

    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    //템플릿 메서드,
    public String requestConnection(String encodedInfo){
        //보안 작업 -> 암호화된 문자열을 디코드합니다.
        String decondedInfo = doSecurity(encodedInfo);
        //반환된 것을 가지고, 아이디, 암호를 할당한다. decondedInfo를 잘라서, id, password를 받았다고 가정하자
        String id = "aaa";
        String password = "bbb";

        if(!authentication(id, password)){
            throw new Error("아이디 암호 불일치");
        }
        //이것도 받았다고 가정하자
        String userName = "user";

        int authorCode = authorization(userName);
        switch (authorCode){
            case -1:
                throw new Error("shut down");
            case 0: // 게임 매니저
                break;
            case 1: //유로 회원
               break;
            case 2: //무로 회원
                break;
            case 3: //권한 없음
                break;
            default: //기타상황
                break;
        }

        return connection(decondedInfo);
    }
}
