package Task_10;

public class Digits {
    public static void main(String[] args) {
        // Write a Java program and compute the sum of the digits of an integer.
        int num = 625;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
