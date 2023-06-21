import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in =  new Scanner (System.in);
        double cValue;
        double fValue;
        int BOILING_TEMP = 100;
        int FREEZING_TEMP = 0;
        System.out.println("What is the temp? [Celsius]");
        cValue = in.nextInt();
        if (cValue <= FREEZING_TEMP) {
            System.out.println("You entered a freezing temperature. Please try again.");
        System.exit(0);
        }
        else if (cValue >= BOILING_TEMP) {
            System.out.println("You entered a boiling temperature. Please try again. ");
            System.exit(0);
        }
        else {
            fValue = ((cValue * 9/5) + 32);
            System.out.println(cValue + " degrees Fahrenheit is " + fValue + " degrees Celsius.");
        }

    }
}