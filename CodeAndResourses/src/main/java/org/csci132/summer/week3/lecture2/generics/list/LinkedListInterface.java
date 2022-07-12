package org.csci132.summer.week3.lecture2.generics.list;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public interface LinkedListInterface<T> {

    public int size();

    public boolean isEmpty();

    public T first();

    public T last();

    public void addFirst(T element);

    public void addLast(T element);

    public T removeFirst();
}
