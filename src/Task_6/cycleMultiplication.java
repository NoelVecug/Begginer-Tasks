package Task_6;

import java.util.Scanner;

public class cycleMultiplication {
    public static void main(String[] args) {
        // Write a Java program that takes a number as input
        // and prints its multiplication table upto 10.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a digit: ");
        int dig = scanner.nextInt();
        int mult = 0;
        for (int i = 1; i <= 10; i++) {
            mult = dig * i;
            System.out.printf("%d x %d = %d\n", dig, i, mult);
        }
    }
}
