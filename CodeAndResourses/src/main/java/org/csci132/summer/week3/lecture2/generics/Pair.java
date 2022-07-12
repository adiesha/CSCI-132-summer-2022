package org.csci132.summer.week3.lecture2.generics;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public class Pair<A, B> {
    A first;
    B second;

    public Pair(A a, B b) {
        first = a;
        second = b;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
