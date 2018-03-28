package com.luo.pattern.builder;

/**
 * ColdDrink
 * <p>
 * Created by luoyingxing on 2018/3/28.
 */

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
