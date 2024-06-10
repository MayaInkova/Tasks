package loops;

import java.util.Scanner;
//програма, която отпечатва на конзолата числата от 1 до N, които не се делят на 3 и 7. Числото N се чете от стандартния вход.
public class NumbersNotDivisibleBy3And7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете число N: ");
        int N = scanner.nextInt();

        System.out.println("Числата от 1 до " + N + ", които не се делят на 3 и 7 са:");
        for (int i = 1; i <= N; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
