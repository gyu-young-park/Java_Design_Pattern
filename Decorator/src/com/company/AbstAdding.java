package com.company;

/**
 * Decorator
 * IBeverage를 implements하여 동일시를 한다.
 * 어떻게 동일시?private IBeverage base;를 맴버변수를 가져서 기능 구현을 여기가 해주면
 * AbstAdding가 마치 IBeverage같아 보인다.
 */
public class AbstAdding implements IBeverage{
    private IBeverage base;

    public AbstAdding(IBeverage base){
        super();
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }
}
