package org.csci132.summer.week5.lecture1;

/**
 * @author : Adiesha
 * @created : 7/23/2022, Saturday
 **/
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new ArrayQueue<>();
        integerQueue.enqueue(3);
        integerQueue.enqueue(2);
        integerQueue.enqueue(77);
        integerQueue.enqueue(28);

        System.out.println(integerQueue.first());
        System.out.println(integerQueue.dequeue());
        System.out.println(integerQueue.dequeue());
    }
}
