package org.csci132.labs;

/**
 * @author : Adiesha
 * @created : 7/16/2022, Saturday
 **/
public class CommissionBaseEmployee extends CommissionEmployee {

    private double baseSalary;

    public CommissionBaseEmployee(String firstName, String lastName, int empID, double commission, double grossSales, double baseSalary) {
        super(firstName, lastName, empID, commission, grossSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "CommissionBaseEmployee{-> " +
                super.toString() +
                "baseSalary=" + baseSalary +
                " } ";
    }
}
