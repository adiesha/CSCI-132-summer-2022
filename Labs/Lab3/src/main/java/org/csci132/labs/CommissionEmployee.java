package org.csci132.labs;

/**
 * @author : Adiesha
 * @created : 7/16/2022, Saturday
 **/
public class CommissionEmployee extends Employee {

    private double commission;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, int empID, double commission, double grossSales) {
        super(firstName, lastName, empID);
        this.commission = commission;
        this.grossSales = grossSales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{-> " +
                super.toString() +
                "commission=" + commission +
                ", grossSales=" + grossSales +
                " } ";
    }
}
