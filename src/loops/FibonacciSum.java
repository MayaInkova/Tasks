package loops;

import java.util.Scanner;
//Програма, която чете от конзолата числото N и отпечатва сумата на първите N члена от редицата на Фибоначи:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ..
public class FibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете числото N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Грешка: Числото трябва да бъде положително.");
            return;
        }

        long sum = 0;
        long first = 0;
        long second = 1;

        for (int i = 0; i < N; i++) {
            if (i <= 1) {
                sum += i; // Добавяме 0 и 1 директно
            } else {
                long next = first + second;
                sum += next;
                first = second;
                second = next;
            }
        }

        System.out.println("Сумата на първите " + N + " члена от редицата на Фибоначи е: " + sum);
    }
}
