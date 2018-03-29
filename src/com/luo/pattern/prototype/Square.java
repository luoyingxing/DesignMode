package com.luo.pattern.prototype;

/**
 * Square
 * <p>
 * Created by luoyingxing on 2018/3/29.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
