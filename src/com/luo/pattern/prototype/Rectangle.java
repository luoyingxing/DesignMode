package com.luo.pattern.prototype;

/**
 * Rectangle
 * <p>
 * Created by luoyingxing on 2018/3/29.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}