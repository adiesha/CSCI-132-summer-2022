package org.csci132.summer.week5.lecture1;

/**
 * @author : Adiesha
 * @created : 7/23/2022, Saturday
 **/
public interface Queue<E> {
    /**
     * Returns the number of elements in the queue.
     */
    int size();

    /**
     * Ts whether the queue is empty.
     */
    boolean isEmpty();

    /**
     * Irts an element at the rear of the queue.
     */
    void enqueue(E e);

    /**
     * Rrns, but does not remove, the first element of the queue (null if empty).
     */
    E first();

    /**
     * oves and returns the first element of the queue (null if empty).
     */
    E dequeue();
}