// Section 3 - Refactoring Towards an OOD

package com.OOP_WK;

public class MortgageCalculator {
    // Class 9 - Moving Static Field
    public final static byte MONTHS_IN_YEAR = 12;
    public final static byte PERCENT = 100;

    // Class 7 - Extracting MortgageCalculator Class
    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        // Class 10 - Extracting Duplicate Logic
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage(float annualInterest) {
        // Class 10 - Extracting Duplicate Logic
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    // Class 11 - Extract getBalance
    public double[] getbalances(){
        var balances = new double[years * MONTHS_IN_YEAR];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = this.calculateBalance(month);

        return balances;
    }

    private float getNumberOfPayments(){
        return years * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest(){
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

}
