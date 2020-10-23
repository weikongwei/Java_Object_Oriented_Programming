// Section 2 - Classes

package com.OOP_WK;

public class Employee {
    // Class 7 & 8 - Encapsulation; Getters and Setters - Calculating Wage
    private int baseSalary; // Set to private is to prevent it to be accessed in the main program
    private int hourlyRate; // getter and setter for these private value can be set using IntelliJ or manually
                            // primitive type variables doesn't need to initialized after declaration
    // Class 16 - Static Members
    public static int numberOfEmployees; // static type means this value or method belongs to the class, not any objects

    // Class 12 - Constructors
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    // Class 14 - Constructor overloading
    public Employee(int baseSalary) {
        this(baseSalary,0);
        // the other way to overload constructor is to retype everything with changes
    }

    // static methods can only access static methods in the same class
    public static void printNumberOfEmployees(){
        System.out.println(Employee.numberOfEmployees);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + hourlyRate * extraHours;
    }

    // Method overloading (same method name, but takes different type of valued as input)
    public int calculateWage() {
        return calculateWage(0);
    }

    // Classes - Class 8
    // Set method to private, so it reduces the privacy
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
            // This will terminate the program with an Exception message.
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
