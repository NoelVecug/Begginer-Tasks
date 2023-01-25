package Task_5;

import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        // Write a Java program to print the sum (addition),
        // multiply, subtract, divide and remainder of two numbers.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int subt = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int rem = num1 % num2;

        System.out.printf("%d + %d = %d\n", num1, num2, sum);
        System.out.printf("%d - %d = %d\n", num1, num2, subt);
        System.out.printf("%d x %d = %d\n", num1, num2, mult);
        System.out.printf("%d / %d = %d\n", num1, num2, div);
        System.out.printf("%d mod %d = %d", num1, num2, rem);
    }
}
