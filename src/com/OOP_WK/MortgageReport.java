// Section 3 - Refactoring Towards an OOD

package com.OOP_WK;

import java.text.NumberFormat;

// Class 6 - Extracting MortgageReport Class
public class MortgageReport {
    // MortgageReport objects are to get mortgage key factors by calling console class
    // and generate reports by using MortgageCalculator objects

    // Class 8 - Moving Away Fromm Static Members
    private int principal;
    private float annualInterest;
    private byte years;
    private MortgageCalculator calculator;
    private final NumberFormat currency;

    // Constructor can only initialize instance variables, not static ones
    public MortgageReport(){
        setPrincipal();
        setAnnualInterest();
        setYears();
        this.calculator = new MortgageCalculator(principal, annualInterest, years);
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage(annualInterest);
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        // Class 11 - Extract getBalance
        for (double balance : calculator.getBalances()) {
            System.out.println(currency.format(balance));
        }
    }

    public void setPrincipal() {
        this.principal = (int) console.readNumber("Principal: ", 1000, 1_000_000);;
    }

    public float getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest() {
        this.annualInterest = (float) console.readNumber("Annual Interest Rate: ", 1, 30);
    }

    public void setYears() {
        this.years = (byte) console.readNumber("Period (Years): ", 1, 30);
    }
}
