package com.OOP_WK;

public class MortgageCalculator {
    public static double calculateMortgage(byte MONTHS_IN_YEAR, byte PERCENT,
                                    int principal,
                                    float annualInterest,
                                    byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public static double calculateBalance(byte MONTHS_IN_YEAR, byte PERCENT,
                                   int principal,
                                   float annualInterest,
                                   byte years,
                                   short numberOfPaymentsMade
    ) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
}
