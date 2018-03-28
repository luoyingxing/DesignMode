package com.luo.pattern.builder;

/**
 * ChickenBurger
 * <p>
 * Created by luoyingxing on 2018/3/28.
 */

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
