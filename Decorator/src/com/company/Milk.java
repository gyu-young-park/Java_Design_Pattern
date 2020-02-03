package com.company;

/**
 * milk, espresso는 ConcreteCompnent class이다.
 *
 */
public class Milk extends AbstAdding{

    public Milk(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+50;
    }
}
