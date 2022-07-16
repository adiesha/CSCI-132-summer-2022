package org.csci132.labs;

/**
 * @author : Adiesha
 * @created : 7/16/2022, Saturday
 **/
public class HourlyEmployee extends Employee {

    private double wage;
    private double hoursWorked;


    public HourlyEmployee(String firstName, String lastName, int empID, double wage, double hoursWorked) {
        super(firstName, lastName, empID);
        this.wage = wage;
        this.hoursWorked = hoursWorked;

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{-> " +
                super.toString() +
                "wage=" + wage +
                ", hoursWorked=" + hoursWorked +
                " } ";
    }
}
