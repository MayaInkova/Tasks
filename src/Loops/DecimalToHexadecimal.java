package Loops;

import java.util.Scanner;

// програма, която преобразува дадено число от десетична в шестнайсетична бройна система.
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете десетично число: ");
        int decimal = scanner.nextInt();

        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Шестнайсетичното представяне е: " + hex);
    }
}
