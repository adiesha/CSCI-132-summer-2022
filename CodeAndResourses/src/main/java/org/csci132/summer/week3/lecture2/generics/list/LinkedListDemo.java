package org.csci132.summer.week3.lecture2.generics.list;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedListInterface<Integer> listInterface = new SingleLinkedList<>();
        listInterface.addFirst(10);
        listInterface.addFirst(12);
        listInterface.addFirst(13);
        listInterface.addFirst(15);
        listInterface.addLast(20);

        System.out.println(listInterface);
    }
}
