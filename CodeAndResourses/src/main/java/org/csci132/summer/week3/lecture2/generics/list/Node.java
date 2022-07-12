package org.csci132.summer.week3.lecture2.generics.list;

public class Node<E> {
    private E element;
    private Node<E> next;

    public Node(E e, Node<E> next) {
        element = e;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}