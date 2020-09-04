package com.OOP_WK;

// Section 3Refactoring Towards an OOD
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    private int principal;
    private float annualInterest;
    private byte years;

    public Mortgage(){
        setPrincipal();
        setAnnualInterest();
        setYears();
    }

    private double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal() {
        this.principal = (int)readNumber("Principal: ", 1000, 1_000_000);;
    }

    public float getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest() {
        this.annualInterest = (float)readNumber("Annual Interest Rate: ", 1, 30);
    }

    public byte getYears() {
        return years;
    }

    public void setYears() {
        this.years = (byte)readNumber("Period (Years): ", 1, 30);
    }

    private double calculateMortgage(
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

    private double calculateBalance(
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

    public void printMortgage() {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
