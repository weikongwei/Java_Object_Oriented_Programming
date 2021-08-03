package com.OOP_WK;

public class TaxReport {
    // Interfaces Class - 5 & 6
    private TaxCalculator calculator;

    // Interfaces Class - 6 - Constructor Injection (Poor Man's Dependency Injection)
    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }
    // Interfaces Class - 5&6
    public void show() {
        System.out.println(calculator.calculateTax());
    }

    // Interfaces Class - 7 - Method Injection
//    public void show(TaxCalculator calculator) {
//        System.out.println(calculator.calculateTax());
//    }

//    // Interfaces Class - 7 - Setter Injection
//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

}
