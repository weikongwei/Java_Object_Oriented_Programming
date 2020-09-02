package com.OOP_WK;

public class Main {

    public static void main(String[] args) {
        // Class-4 Creating Objects
        var textBox1 = new TextBox();
	    textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.text = "text";
        System.out.println(textBox2.text);
        System.out.println("--------------------");

        // Procedural Programming - Calculating Wage
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyrate = 20;
        System.out.println(calculateWage(baseSalary,extraHours,hourlyrate));
        System.out.println("---------------------");

        // Encapsulation; Getters and Setters - Calculating Wage
        var employee1 = new Employee();
        employee1.setHourlyRate(20);
        employee1.setBaseSalary(50_000);
        System.out.println(employee1.calculateWage(10));

    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyrate
    ) {
        return baseSalary + extraHours*hourlyrate;
    }
}
