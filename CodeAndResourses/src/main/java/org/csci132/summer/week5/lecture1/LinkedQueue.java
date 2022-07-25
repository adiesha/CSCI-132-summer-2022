package org.csci132.summer.week5.lecture1;

import org.csci132.summer.week3.lecture2.generics.list.SingleLinkedList;

/**
 * Realization of a FIFO queue as an adaptation of a SinglyLinkedList.
 */


public class LinkedQueue<E> implements Queue<E> {
    private SingleLinkedList<E> list = new SingleLinkedList<>(); // an empty list


    public LinkedQueue() {
    } // new queue relies on the initially empty list


    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(E element) {
        list.addLast(element);
    }

    public E first() {
        return list.first();
    }

    public E dequeue() {
        return list.removeFirst();
    }
}