import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double galsInTank = 0;
        double economy = 0;
        double gasPrice = 0;
        double cost100Miles;
        double distanceCurrent;
        String trash;
        boolean done = false;
        System.out.println("How many gallons of gas are in your tank?");
        do {
            if (in.hasNextDouble()) {
                galsInTank = in.nextDouble();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("\nError, you entered an invalid number: " + trash + ".\nPlease try again with valid characters only [0-9]: ");
            }
        } while (!done);
        done = false;
        in.nextLine();
        System.out.println("What is your fuel efficiency in miles per gallon?");
        do {
            if (in.hasNextDouble()) {
                economy = in.nextDouble();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("\nError, you entered an invalid number: " + trash + "\nPlease try again with valid characters only [0-9]: ");
            }
        } while (!done);
        done = false;
        in.nextLine();
        System.out.println("What is the price of one gallon of gas?");
        do {
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.print("\nError, you entered an invalid number: " + trash + "\nPlease try again with valid characters only [0-9]: ");
            }
        } while (!done);
//        Then print the cost per 100 miles and how far the car can go with the gas in the tank.
        cost100Miles = gasPrice / (economy / 100);
        distanceCurrent = economy * galsInTank;
        System.out.printf("The cost to drive 100 miles would be: $%.2f\nWith the gas in your tank, you can currently drive %.2f miles.", cost100Miles, distanceCurrent );
    }
}