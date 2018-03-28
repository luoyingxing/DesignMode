package com.luo.pattern.builder;

/**
 * VegBurger
 * <p>
 * Created by luoyingxing on 2018/3/28.
 */

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
