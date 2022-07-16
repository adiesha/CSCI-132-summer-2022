package org.csci132.labs;

/**
 * @author : Adiesha
 * @created : 7/16/2022, Saturday
 **/
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Joohn", "Doe", 1);
        System.out.println(employee1);

        Employee employee2 = new HourlyEmployee("Abraham", "Lincoln", 2, 2000.0, 55);
        System.out.println(employee2);

        Employee employee3 = new CommissionEmployee("Franklin", "Roosevelt", 3, 1500, 11000);
        System.out.println(employee3);
        Employee employee4 = new CommissionBaseEmployee("Lyndon", "Johnson", 4, 1200, 10000, 2500);
        System.out.println(employee4);
    }
}
