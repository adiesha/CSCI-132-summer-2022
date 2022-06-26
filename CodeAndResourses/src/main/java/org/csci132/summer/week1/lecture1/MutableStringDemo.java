package org.csci132.summer.week1.lecture1;

/**
 * @author : Adiesha
 * @created : 6/25/2022, Saturday
 **/
public class MutableStringDemo {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        StringBuilder stringBuilder = new StringBuilder("");
        System.out.println(stringBuilder.toString());
        stringBuilder.append("Jane");
        stringBuilder.append(" ");
        stringBuilder.append("Doe");
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.reverse().toString());
        stringBuilder.insert(3, " test ");
        System.out.println(stringBuilder.toString());
    }
}
