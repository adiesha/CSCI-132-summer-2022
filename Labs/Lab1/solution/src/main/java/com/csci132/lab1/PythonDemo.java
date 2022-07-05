package com.csci132.lab1;

/**
 * @author : Adiesha
 * @created : 7/5/2022, Tuesday
 **/
public class PythonDemo {
    public static void main(String[] args) {
        PythonDemo pythonDemo = new PythonDemo();
        pythonDemo.checkTheNumber(1);
        String schoolName = pythonDemo.getTheSchoolName("Montana State");
        System.out.println("School Name: " + schoolName);
        pythonDemo.checkTheNumber(2);
        pythonDemo.checkTheNumber(3);
    }

    public void checkTheNumber(int number) {
        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else {
            System.out.println("Neither 1 nor 2");
        }
    }

    public String getTheSchoolName(String school) {
        System.out.println("user asked for the school name for " + school);
        return "MSU";
    }

    public void printNumbersFrom1To10() {
        System.out.println("Printing numbers from 1 to 10");
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }
}
