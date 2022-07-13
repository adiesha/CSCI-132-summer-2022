package org.csci132.summer.week3.lecture3;

/**
 * @author : Adiesha
 * @created : 7/13/2022, Wednesday
 **/
public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> integerDoublyLinkedList = new DoublyLinkedList<>();
        integerDoublyLinkedList.addFirst(10);
        integerDoublyLinkedList.addFirst(14);
        integerDoublyLinkedList.addFirst(43);
        integerDoublyLinkedList.addFirst(54);
        integerDoublyLinkedList.addFirst(766);
        integerDoublyLinkedList.addFirst(23);
        integerDoublyLinkedList.addLast(45);
        integerDoublyLinkedList.addLast(23);
        integerDoublyLinkedList.addLast(657);
        integerDoublyLinkedList.addFirst(78);
        integerDoublyLinkedList.addFirst(11);



        System.out.println(integerDoublyLinkedList);
    }
}
