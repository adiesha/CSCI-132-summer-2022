package com.csci132.lab2;

/**
 * @author : Adiesha
 * @created : 7/8/2022, Friday
 **/
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double heightAndWidth) {
        this.height = heightAndWidth;
        this.width = heightAndWidth;
    }

    public double perimeter() {
        return 2 * (this.height + this.width);
    }

    public double area() {
        return this.height * this.width;
    }
}
