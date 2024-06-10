package loops;

import java.util.Scanner;
// програма, която чете от конзолата положително цяло число N (N < 20) и отпечатва матрица.
public class NumberMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете число N (N < 20): ");
        int N = scanner.nextInt();

        if (N >= 20) {
            System.out.println("Грешка: Числото трябва да бъде по-малко от 20.");
            return;
        }

        // Отпечатване на матрицата
        for (int row = 1; row <= N; row++) {
            for (int col = row; col < row + N; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
