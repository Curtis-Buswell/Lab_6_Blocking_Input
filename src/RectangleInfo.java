import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double length = 0;
        double width = 0;
        double hypotenuse;
        double area;
        double perimeter;
        boolean done = false;
        String trash;
        System.out.println("What is the length of the rectangle?");
        do {
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                done = true;
            }
            else {
                // fixed error in earlier assignments by just inverting the expression with "!" to avoid unnecessary if else statement with an empty if
                trash = in.nextLine();
                System.out.println("\nError, you entered an invalid number: " + trash + ".\nPlease try again with valid characters only [0-9]: ");
            }
        } while (!done);
        in.nextLine();
        done = false;
        System.out.println("What is the width of the rectangle?");
        do {
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("\nError, you entered an invalid number: " + trash + ".\nPlease try again with valid characters only [0-9]: ");
            }
        } while (!done);
        hypotenuse = Math. sqrt(length * length + width * width);
        area = length * width;
        perimeter = length * 2 + width * 2;
        System.out.printf("The area is %7.2f\nThe hypotenuse is %7.2f\nThe perimeter is %7.2f", area, hypotenuse, perimeter);
    }
}
