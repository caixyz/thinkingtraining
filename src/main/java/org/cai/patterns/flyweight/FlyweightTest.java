package org.cai.patterns.flyweight;

import org.cai.patterns.flyweight.entity.Circle;
import org.cai.patterns.flyweight.factory.ShapeFactory;
import org.junit.Test;

/**
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 * 
 * @Author: caisijun
 * @Date: 2021/2/2 0002
 */
public class FlyweightTest {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};


    @Test
    public void Test1() {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(120);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
