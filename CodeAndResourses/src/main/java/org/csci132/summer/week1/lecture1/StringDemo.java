package org.csci132.summer.week1.lecture1;

import java.util.Locale;

/**
 * @author : Adiesha
 * @created : 6/28/2022, Tuesday
 **/
public class StringDemo {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);
        String name = "John";
        String concatenatedString = greeting + " " + name;
        System.out.println(concatenatedString);

        System.out.println(greeting.charAt(4));
        System.out.println(greeting.length());
        System.out.println(concatenatedString.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting);
    }
}
