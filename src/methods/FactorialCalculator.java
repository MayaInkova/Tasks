package methods;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете число: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);

        System.out.println("Факториел на " + number + " е " + factorial);
    }

    // Метод за изчисляване на факториел
    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Числото трябва да е неотрицателно.");
        }

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

