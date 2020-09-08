package com.OOP_WK;

import java.util.Scanner;

public class console {
    // Class 4 - Extracting the console class
    private static Scanner scanner = new Scanner(System.in);

    // Setting the method to static so we can access the method without creating objects.
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    // Class 5 - Overloading methods (in case if we don't next min and max as input)
    public static double readNumber(String prompt) {
        return scanner.nextDouble();    // return the scanner to read input without putting into any variable
    }




}
