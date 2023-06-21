import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double length;
        double width;
        double hypotenuse;
        double area;
        double perimeter;
        System.out.println("What is the length of the rectangle?");
        if (!in.hasNextDouble()){
            // fixed error in earlier assignments by just inverting the expression with "!" to avoid unnecessary if else statement with an empty if
            System.out.println("Error. Please enter a valid number and try again.");
            System.exit(0);
        }
        length = in.nextDouble();
        System.out.println("What is the width of the rectangle?");
        if (!in.hasNextDouble()){
            System.out.println("Error. Please enter a valid number and try again.");
            System.exit(0);
        }
        width = in.nextDouble();
        hypotenuse = length * length + width * width;
        area = length * width;
        perimeter = length * 2 + width * 2;
        System.out.printf("The area is %7.2f\nThe hypotenuse is %7.2f\nThe perimeter is %7.2f", area, hypotenuse, perimeter);
//        using printf here to demonstrate it in the lab but felt it was not useful here
    }
}
