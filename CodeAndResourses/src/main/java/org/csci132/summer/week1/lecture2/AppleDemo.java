package org.csci132.summer.week1.lecture2;

public class AppleDemo {
    public static void main(String[] args) {
        System.out.println("Hello");

        Apple a1 = new Apple("RED", "a1");
        Apple a2 = new Apple("GREEN", "a2");
        Apple a3 = new Apple();


        System.out.println("Color of Apple 1 is " + a1.getColor());
        System.out.println("Color of Apple 2 is " + a2.getColor());


    }
}
