package com.OOP_WK;

// Section 3Refactoring Towards an OOD
import java.text.NumberFormat;

public class MortgageReport {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageReport(){
        setPrincipal();
        setAnnualInterest();
        setYears();
    }

    public int getPrincipal() {
        return principal;
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

    public byte getYears() {
        return years;
    }

    public void setYears() {
        this.years = (byte) console.readNumber("Period (Years): ", 1, 30);
    }

    public void printMortgage() {
        double mortgage = MortgageCalculator.calculateMortgage(MONTHS_IN_YEAR, PERCENT, principal, annualInterest, years);
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
            double balance = MortgageCalculator.calculateBalance(MONTHS_IN_YEAR, PERCENT, principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
