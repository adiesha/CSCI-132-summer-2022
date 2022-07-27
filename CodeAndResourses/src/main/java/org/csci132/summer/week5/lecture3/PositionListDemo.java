package org.csci132.summer.week5.lecture3;

/**
 * @author : Adiesha
 * @created : 7/26/2022, Tuesday
 **/
public class PositionListDemo {
    public static void main(String[] args) {
        LinkedPositionalList<Integer> integerPositionalList = new LinkedPositionalList<>();

        integerPositionalList.addFirst(12);
        integerPositionalList.addFirst(2);
        integerPositionalList.addFirst(4);
        integerPositionalList.addFirst(95);
        Position<Integer> position = integerPositionalList.addLast(4);
        System.out.println(position);
        for (Integer a : integerPositionalList) {
            System.out.println(a);
        }
    }
}
