package org.csci132.summer.week5.lecture4.compare;

/**
 * @author : Adiesha
 * @created : 7/25/2022, Monday
 **/
public class Order implements Comparable<Order> {
    private int price;

    public Order(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Order o) {
        return this.price = o.price;
    }


}
