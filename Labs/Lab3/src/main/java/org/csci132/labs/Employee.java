package org.csci132.labs;

/**
 * @author : Adiesha
 * @created : 7/16/2022, Saturday
 **/
public class Employee {

    private String firstName;
    private String lastName;
    private int empID;

    public Employee(String firstName, String lastName, int empID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empID=" + empID +
                '}';
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
}
