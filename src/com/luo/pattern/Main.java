package com.luo.pattern;

import com.luo.pattern.abstractFactory.AbstractFactory;
import com.luo.pattern.abstractFactory.Color;
import com.luo.pattern.abstractFactory.FactoryProducer;
import com.luo.pattern.factory.Shape;
import com.luo.pattern.factory.ShapeFactory;
import com.luo.pattern.singleton.SingletonFour;
import com.luo.pattern.singleton.SingletonOne;
import com.luo.pattern.singleton.SingletonThrees;
import com.luo.pattern.singleton.SingletonTwo;

public class Main {

    public static void main(String[] args) {


//        factory();

//        abstractFactory();

        singleton();
    }


    /**
     * 工厂模式
     */
    private static void factory() {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }


    /**
     * 抽象工厂模式（工厂的工厂）
     */
    private static void abstractFactory() {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("RED");

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("Green");

        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor("BLUE");

        //调用 Blue 的 fill 方法
        color3.fill();
    }


    /**
     * 单例模式
     */
    private static void singleton() {
        //一般情况下，建议使用第 1 种饿汉方式。
        SingletonOne.getInstance().print();

        //只有在要明确实现 lazy loading 效果时，才会使用第 2 种登记方式。
        SingletonTwo.getInstance().print();

        //如果涉及到反序列化创建对象时，可以尝试使用第 3 种枚举方式。
        SingletonThrees.INSTANCE.print();

        //如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
        SingletonFour.getSingleton().print();

    }
}