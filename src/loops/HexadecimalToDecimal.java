package loops;
// програма, която преобразува дадено число от шестнайстична в десетична бройна система.
import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете шестнайсетично число: ");
        String hex = scanner.next();

        int decimal = Integer.parseInt(hex, 16);

        System.out.println("Десетичното представяне е: " + decimal);
    }
}
