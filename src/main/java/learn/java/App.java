package learn.java;

import java.util.Scanner;

/**
 * Sum different types of digits from a number
 */

public class App {
    public static int sumDigits(int number) {
        int sum = 0;

        if (number < 10) {
            return number;
        } else {
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
            return sum;
        }
    }

    public static int sumFirstAndLastDigits(int number) {
        int sum = number % 10; // assign last digit of a number to sum

        if (number < 10) {
            return number;
        } else {
            while (number != 0) {
                number = number / 10;
                // if number < 10 means, number has the first digit of the main number
                if (number < 10) {
                    sum += number;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("sumDigits() = " + sumDigits(input));
        System.out.println("sumFirstAndLastDigits() = " + sumFirstAndLastDigits(input));
    }
}
