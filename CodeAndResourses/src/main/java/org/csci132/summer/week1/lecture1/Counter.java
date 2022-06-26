package org.csci132.summer.week1.lecture1;

/**
 * @author : Adiesha
 * @created : 6/24/2022, Friday
 **/
public class Counter {

    private int count;
    private int p1 = 10, p2 = 20;

    public Counter() {
    }

    public Counter(int initial) {
        //this.count = initial;
        count = initial;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void increment(int delta) {
        int count = delta;
        count += delta;
    }

    public void reset() {
        count = 0;
    }

}
