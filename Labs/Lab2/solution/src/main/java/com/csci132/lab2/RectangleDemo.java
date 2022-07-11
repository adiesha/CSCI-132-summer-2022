package com.csci132.lab2;

/**
 * @author : Adiesha
 * @created : 7/8/2022, Friday
 **/
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.23, 21.34);
        Rectangle square = new Rectangle(5.6);

        System.out.println("Area of the Rectangle is " + rectangle.area());
        System.out.println("Perimeter of the Rectangle is " + rectangle.perimeter());

        System.out.println("Area of the square is " + square.area());
        System.out.println("Perimeter of the square is " + square.perimeter());
    }
}
