package org.csci132.summer.week3.lecture2.Integer;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public class SinglyLinkedListInt implements LinkedListInteger {

    private Node head;
    private Node tail;

    private int size;

    public SinglyLinkedListInt() {

    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Integer first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    @Override
    public Integer last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    @Override
    public void addFirst(Integer element) {
        head = new Node(element, this.head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    @Override
    public void addLast(Integer element) {
        Node newest = new Node(element, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    @Override
    public Integer removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Integer answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }
}
