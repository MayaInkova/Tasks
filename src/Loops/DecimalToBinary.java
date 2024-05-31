package Loops;
//Програма, която преобразува дадено число от десетична в двоична бройна система.
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете десетично число: ");
        int decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Двоичното представяне е: " + binary);
    }
}
