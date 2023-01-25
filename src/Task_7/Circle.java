package Task_7;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // Write a Java program to print the area and perimeter of a circle.
        // perimeter = 2 * PI * r
        // area = PI * r^2
        // I was wanted to add input radius from console and decimal formatter
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.000");
        System.out.print("Input the radius: ");
        double r = scanner.nextDouble();

        double per = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);

        System.out.println("Perimeter is " + formatter.format(per));
        System.out.println("Area is " + formatter.format(area));
    }
}
