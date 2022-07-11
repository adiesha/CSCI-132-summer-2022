package com.csci132.lab2;

/**
 * @author : Adiesha
 * @created : 7/8/2022, Friday
 **/
public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double substract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double mod(double a, double b) {
        return a % b;
    }

    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public static double sqrt(double a) {
        return Math.pow(a, 0.5);
    }
}
