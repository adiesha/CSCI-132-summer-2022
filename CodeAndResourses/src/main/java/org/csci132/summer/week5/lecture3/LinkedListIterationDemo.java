package org.csci132.summer.week5.lecture3;

import org.csci132.summer.week3.lecture3.DoublyLinkedList;

import java.util.Iterator;

/**
 * @author : Adiesha
 * @created : 7/27/2022, Wednesday
 **/
public class LinkedListIterationDemo {
    public static void main(String[] args) {
        DoublyLinkedList<String> stringDoublyLinkedList = new DoublyLinkedList<>();

        stringDoublyLinkedList.addFirst("sdjfg");
        stringDoublyLinkedList.addFirst("fg");
        stringDoublyLinkedList.addFirst("3246");
        stringDoublyLinkedList.addFirst("-0tgfgh");
        stringDoublyLinkedList.addFirst("cgf");
        stringDoublyLinkedList.addFirst("jhgkjy f");


//        for (String s :
//                stringDoublyLinkedList) {
//            System.out.println(s);
//        }
//
//        System.out.println("------------------------------");
//
//        Iterator<String> iterator = stringDoublyLinkedList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
