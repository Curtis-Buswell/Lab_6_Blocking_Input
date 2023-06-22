//Write a program that prompts the user for a measurement in meters and then converts it to miles, feet, and inches.
//        Again, check for valid input and exit with an error msg if you don’t get it. You can look up the conversion formulas with the Web
// 1 meter = 39.37 inches
// 1 mile = 5280 feet

import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String trash;
        boolean done = false;
        double meters = 0;
        double inputMeters = 0;
        double miles;
        double feet;
        double inches;
        System.out.println("What is the measurement in meters?");
        do {
            if (in.hasNextDouble()) {
                inputMeters = in.nextDouble();
                meters = inputMeters;
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nError, you entered an invalid number: " + trash + ".\nPlease try again with valid characters only [0-9]: ");
            }
        }
        while (!done);
        miles = meters / 1609.34;
        meters %= 1609.34;
        feet = meters / 0.3048;
        meters %= 0.3048;
        inches = meters / 0.0254;
        System.out.printf("%.0f meters converts to %.2f miles, %.2f feet, and %.2f inches.", inputMeters, miles, feet, inches);
    }
}
