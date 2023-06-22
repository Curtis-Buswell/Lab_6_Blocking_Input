import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();  // I usually call it rnd or gen
        int userGuess = 0;
        int realNum = generator.nextInt(10) + 1;
        boolean done = false;
        String trash;
        System.out.println("Welcome to num guesser!\nWhat is your guess?");
        do {
            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nError, you entered an invalid number: " + trash + ".\nPlease try again with valid characters only [0-9]: ");
            }
        }
        while (!done);
        {
            System.out.println("The number was " + realNum + "!");
            if (userGuess == realNum) {
                System.out.println("You win!");
            } else if (userGuess > realNum) {
                System.out.println("You were too high.");
            } else {
                System.out.println("You were too low.");
            }
        }
    }
}