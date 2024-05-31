package Loops;

import java.util.Scanner;

// програма, която преобразува дадено число от двоична в десетична бройна система.
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете двоично число: ");
        String binary = scanner.next();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Десетичното представяне е: " + decimal);
    }
}

