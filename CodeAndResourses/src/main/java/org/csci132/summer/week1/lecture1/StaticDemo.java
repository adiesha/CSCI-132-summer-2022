package org.csci132.summer.week1.lecture1;

/**
 * @author : Adiesha
 * @created : 6/28/2022, Tuesday
 **/
public class StaticDemo {
    public static void main(String[] args) {
        System.out.println(Static.count);
        Static.count = 8;
        System.out.println(Static.count);
        Static.staticMethod();
    }
}
