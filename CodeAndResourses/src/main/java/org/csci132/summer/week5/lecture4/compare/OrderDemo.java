package org.csci132.summer.week5.lecture4.compare;

/**
 * @author : Adiesha
 * @created : 7/25/2022, Monday
 **/
public class OrderDemo {
    public static void main(String[] args) {
        Order order1 = new Order(10);
        Order order2 = new Order(1);
        Order order3 = new Order(100);
        Order order4 = new Order(10);

        System.out.println(order1.compareTo(order3));
        System.out.println(order1.compareTo(order2));
        System.out.println(order1.compareTo(order4));
    }
}
