package Task_8;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        // Write a Java program that takes three numbers
        // as input to calculate and print the average of the numbers.
        // I understood it this way: I should find min and max numbers and print the number between them.

        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3]; // must be an odd number ofc
        System.out.println("Input " + nums.length + " numbers through 'Enter': ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("The average number is " + nums[((nums.length - 1) / 2)]);
    }
}
