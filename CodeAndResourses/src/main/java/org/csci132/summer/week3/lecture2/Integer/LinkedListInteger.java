package org.csci132.summer.week3.lecture2.Integer;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public interface LinkedListInteger {
    public int size();

    public boolean isEmpty();

    public Integer first();

    public Integer last();

    public void addFirst(Integer element);

    public void addLast(Integer element);

    public Integer removeFirst();
}
