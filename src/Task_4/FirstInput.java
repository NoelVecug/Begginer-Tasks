package Task_4;

import java.util.Scanner;

public class FirstInput {
    public static void main(String[] args) {
        // Write a Java program that takes two numbers as input and
        // display the product of two numbers.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        int mult = num1 * num2;
        System.out.printf("%d x %d = %d", num1, num2, mult);
    }
}
