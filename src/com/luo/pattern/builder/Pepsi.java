package com.luo.pattern.builder;

/**
 * Pepsi
 * <p>
 * Created by luoyingxing on 2018/3/28.
 */

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
