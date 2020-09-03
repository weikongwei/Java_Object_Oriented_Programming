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

        // Class 6 - Counter Example: Procedural Programming - Calculating Wage
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyrate = 20;
        System.out.println(calculateWage(baseSalary,extraHours,hourlyrate));
        System.out.println("---------------------");

        // Class 7 & 8 - Encapsulation; Getters and Setters - Calculating Wage
        var employee1 = new Employee(50_000, 20);
        System.out.println(Employee.numberOfEmployees);
        System.out.println(employee1.calculateWage(10));

        // Class 11 - Reducing Coupling
        var browser = new Browser();
        browser.navigate("asdf.com"); // Hide complexity in class itself,
                                            // don't expose the unnecessary in main program



    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyrate
    ) {
        return baseSalary + extraHours*hourlyrate;
    }
}
