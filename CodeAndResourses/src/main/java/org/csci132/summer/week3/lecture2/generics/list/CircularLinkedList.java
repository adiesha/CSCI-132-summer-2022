package org.csci132.summer.week3.lecture2.generics.list;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public class CircularLinkedList<T> implements LinkedListInterface<T> {

    private Node<T> tail;
    private int size;

    public CircularLinkedList() {

    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T first() {
        if (isEmpty())
            return null;
        return tail.getNext().getElement();
    }

    @Override
    public T last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    @Override
    public void addFirst(T element) {
        if (isEmpty()) {
            tail = new Node<>(element, null);
            tail.setNext(tail);
        } else {
            Node<T> newest = new Node<>(element, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    @Override
    public void addLast(T element) {
        addFirst(element);
        tail = tail.getNext();
    }

    @Override
    public T removeFirst() {
        if (isEmpty())
            return null;
        Node<T> head = tail.getNext();
        if (head == tail)
            tail = null;
        else
            tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }

    public void rotate() {
        if (tail != null)
            tail = tail.getNext();
    }
}
