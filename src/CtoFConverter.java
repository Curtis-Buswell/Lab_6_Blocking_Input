import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in =  new Scanner (System.in);
        double cValue;
        double fValue;
        boolean done = false;
        String trash;

        do {
            System.out.println("What is the temp? [Celsius]");
            if (in.hasNextInt())
            {
                cValue = in.nextInt();
                in.nextLine();
                fValue = ((cValue * 9/5) + 32);
                System.out.println(cValue + " degrees Fahrenheit is " + fValue + " degrees Celsius.");
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nError, you entered an invalid number: " + trash + ".\nPlease try again with valid characters only [0-9]: ");
            }
        }while (!done);
    }
}