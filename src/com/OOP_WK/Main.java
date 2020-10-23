package com.OOP_WK;


import org.w3c.dom.Text;

public class Main {
    ////////////////////////////////
    // Section 1 & 2 : OOP - Class//
    ////////////////////////////////

    public static void main(String[] args) {
        // Class-4 Creating Objects
//        var textBox1 = new TextBox();
//	    textBox1.setText("Box 1");
//        System.out.println(textBox1.text.toUpperCase());
//
//        var textBox2 = new TextBox();
//        textBox2.text = "text";
//        System.out.println(textBox2.text);
//        System.out.println("--------------------");
//
//        // Class 6 - Counter Example: Procedural Programming - Calculating Wage
//        int baseSalary = 50_000;
//        int extraHours = 10;
//        int hourlyrate = 20;
//        System.out.println(calculateWage(baseSalary,extraHours,hourlyrate));
//        System.out.println("---------------------");
//
//        // Class 7 & 8 - Encapsulation; Getters and Setters - Calculating Wage
//        var employee1 = new Employee(50_000, 20);
//        System.out.println(Employee.numberOfEmployees);
//        System.out.println(employee1.calculateWage(10));
//
//        // Class 11 - Reducing Coupling
//        var browser = new Browser();
//        browser.navigate("asdf.com"); // Hide complexity in class itself,
//                                            // don't expose the unnecessary in main program


        ///////////////////////////////////////////
        // Section 3 - Refactoring Towards an OOD//
        ///////////////////////////////////////////

        // Mortgage Calculator in OOD Format
//        var mortgageReport = new MortgageReport();
//        mortgageReport.printMortgage();
//        mortgageReport.printPaymentSchedule();



        ///////////////////////////////////////////
        //         Section 4 - Inheritance       //
        ///////////////////////////////////////////

        // Inheritance - class 2
//        var control =  new TextBox();
//        control.disable();
//        System.out.println(control.isEnabled());

        // Inheritance - class 3
//        var box1 = new TextBox();
//        var box2 = new TextBox();
//        System.out.println(box1.toString());
//        System.out.println(box2.hashCode());

        // Inheritance - class 6 Overriding Methods
//        box1.setText("Hello World");
//        System.out.println(box1);

        // Inheritance - class 7 Upcasting and Downcasting
//        var control = new UIControl(true);
//        var textBox = new TextBox();
//        show(textBox);

        // Inheritance - class 8 Comparing Objects
//        var point1 = new Point(1,2);
//        var point2 = new Point(1,2);
//        System.out.println(point1.equals(point2));
//        System.out.println(point1 == point2);  // "==" is to compare the value stored in the primitive variable, the addresses
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());

        // Inheritance - class 9 Polymorphism
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for(var control: controls) {
            control.render();
        }
    }

    // Inheritance - class 7 Upcasting and Downcasting
    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;    // Now "textBox" will refer to the same object as "control"
            textBox.setText("Hello World"); // Since it is reference type variable, changing on one will affect the other
        }
        System.out.println(control);    // Thus when printing "control", it would show "Hello World", even we set it
                                        // through textBox.
    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyrate
    ) {
        return baseSalary + extraHours*hourlyrate;
    }
}








