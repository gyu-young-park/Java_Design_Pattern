package Auth;

public class DefaultGameConnectionHelper extends AbstGameConnectionHelper{
    @Override
    protected String doSecurity(String string) {
        //디코드 작업을 했다고 하자
        System.out.println("디코드");
        //추가적으로 강화된 알고리즘을 적용한다면
        System.out.println("강화된 알고리즘을 적용한다.");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디 , 암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");

        //추가적으로 강화된 알고리즘을 적용한다면
        //유저의 나이를 알 수 있으니, 나이를 확인하고 성인이 아니고 10시가 지났다면
        //권한이 없는 것으로 한다.
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("연결합니다. 마지막 접속 단계");
        return info;
    }
}
