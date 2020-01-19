package framework;

public abstract class ItemCreator {
    //이 create함수가 template 메서드 처럼 된다.
    //이게 팩토리 메서드이다. 그런데 이게 어떤 방식이나면 템플릿 메서드 방식을 사용하고 있다.
    public Item create(){
        Item item;
        //step1
        requestItemInfo();
        //step2
        item = createItem();
        //step3
        createItemLog();
        return item;
    }
    //아이템 생성하기 전에 db에서 정보를 요청
    abstract protected void requestItemInfo();
    //아이템 생성 후 db에 생성 정보(로깅)를 남긴다.
    abstract protected void createItemLog();
    //아이템 생성 알고리즘
    abstract protected Item createItem();
}
