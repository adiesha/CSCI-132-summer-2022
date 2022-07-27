package org.csci132.summer.week5.lecture3;

/**
 * @author : Adiesha
 * @created : 7/26/2022, Tuesday
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(10);
        arrayList1.add(0, 10);
        arrayList1.add(1, 16);
        arrayList1.add(2, 15);
        arrayList1.add(0, 106);
        arrayList1.set(0, 5);

        for (Integer a : arrayList1) {
            System.out.println(a);
        }


    }
}
