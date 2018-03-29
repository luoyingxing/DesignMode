package com.luo.pattern.prototype;

/**
 * Circle
 * Created by luoyingxing on 2018/3/29.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
