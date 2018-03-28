package com.luo.pattern.builder;

/**
 * Burger
 * <p>
 * Created by luoyingxing on 2018/3/28.
 */

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
