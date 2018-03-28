package com.luo.pattern.builder;

/**
 * Item
 * <p>
 * Created by luoyingxing on 2018/3/28.
 */

public interface Item {
    String name();

    Packing packing();

    float price();

}