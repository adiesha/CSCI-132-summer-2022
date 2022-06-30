package org.csci132.summer.week1.lecture2;

public class PythonDemo {
    public static void main(String[] args) {
        PythonDemo pythonDemo = new PythonDemo();
        pythonDemo.convertToCelsius(67);
        pythonDemo.convertToFahrenheit(30);
        int result = pythonDemo.multiplyTwoNumbers(23, 10);
        System.out.println(result);
    }
    public int multiplyTwoNumbers(int value1,int value2) {
        return value1* value2;
    }

    public void convertToFahrenheit(double valueInCelsius) {
        double fahrenheit = (valueInCelsius * 1.8) + 32;
        System.out.println(valueInCelsius +  " celsius is equal to " + fahrenheit + " Fahrenheit");
    }

    public void convertToCelsius(double valueInFahrenheit) {
        double celsius = (valueInFahrenheit - 32)/1.8;
        System.out.println(valueInFahrenheit +  " Fahrenheit is equal to " + celsius + " celsius");
    }

}


