package ObjectAndClass;

import java.util.Scanner;

//програма, която по дадени два катета намира хипотенузата на правоъгълен триъгълник. Реализира
// въвеждане на дължините на катетите от стандартния вход, а за пресмятането на хипотенузата използвам методи на класа Math.
public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на дължините на катетите
        System.out.print("Въведете дължината на първия катет: ");
        double a = scanner.nextDouble();

        System.out.print("Въведете дължината на втория катет: ");
        double b = scanner.nextDouble();

        // Изчисляване на хипотенузата
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Извеждане на резултата
        System.out.printf("Дължината на хипотенузата е: %.2f%n", c);
    }
}
