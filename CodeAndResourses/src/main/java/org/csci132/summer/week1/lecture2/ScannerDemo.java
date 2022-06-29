package org.csci132.summer.week1.lecture2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author : Adiesha
 * @created : 6/29/2022, Wednesday
 **/
public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println(age);



        Scanner fileReader = new Scanner(new File("src/main/resources/inputfile.txt"));
//        Scanner fileReader = new Scanner(new File());
//        System.out.println(new File(".").getAbsolutePath());
        while (fileReader.hasNextLine()){
            System.out.println(fileReader.nextLine());
        }

    }
}
