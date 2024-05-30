package Basics;

//  Напишете програма, която показва знака (+ или -)
//  от частното на две реални числа, без да го пресмята.

import java.util.Scanner;

public class Constructors02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        char sign;

        // Проверка на знаковете на числата
        if ((number1 < 0 && number2 > 0) || (number1 > 0 && number2 < 0)) {
            sign = '-';
        } else {
            sign = '+';
        }

        System.out.println("The sign of the quotient is: " + sign);
    }
}

