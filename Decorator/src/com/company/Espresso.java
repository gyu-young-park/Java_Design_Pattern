package com.company;

public class Espresso extends AbstAdding{
    static protected int espressoCount = 0;

    public Espresso(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + getAddPrice();
    }
    //에스프레소의 샷을 추가할 때 마다 할인을 하도록 한다.
    private static int getAddPrice(){
        espressoCount += 1;
        int addPrice = 100;
        if(espressoCount > 1){
            addPrice = 70;
        }
        return addPrice;
    }
}
