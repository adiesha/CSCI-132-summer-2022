package org.csci132.summer.week3.lecture2.generics;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public class PairWithObject {
    Object first;
    Object second;

    public PairWithObject(Object a, Object b) {
        first = a;
        second = b;
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }
}
