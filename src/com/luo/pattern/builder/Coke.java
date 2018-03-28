package com.luo.pattern.builder;

/**
 * Coke
 * <p>
 * Created by luoyingxing on 2018/3/28.
 */

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
