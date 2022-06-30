package org.csci132.summer.week1.lecture2;

import org.csci132.summer.App;

public class Apple {
    private String color;
    private double diameter;
    private String name;
    private int id;

    public Apple() {

    }

    public Apple(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        this.method();
        return this.color;
    }

    private void method() {
        System.out.println("Apple");
    }


}
