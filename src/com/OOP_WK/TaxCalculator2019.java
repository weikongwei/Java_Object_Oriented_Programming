package com.OOP_WK;

public class TaxCalculator2019 extends TaxCalculator2018 implements TaxCalculator{
    private double taxableIncome;

    public TaxCalculator2019(double taxableIncome) {
        super(taxableIncome);
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.35;
    }
}
