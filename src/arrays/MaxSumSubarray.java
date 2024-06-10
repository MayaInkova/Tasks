package arrays;
// програма, която чете от конзолата две цели числа N и K, и масив от N елемента. Да се намерят тези K елемента, които имат максимална сума.
import java.util.Scanner;

public class MaxSumSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на N и K
        System.out.print("Въведете броя на елементите в масива N: ");
        int N = scanner.nextInt();

        System.out.print("Въведете броя на елементите K: ");
        int K = scanner.nextInt();

        // Проверка за невалидни стойности на K
        if (K <= 0 || K > N) {
            System.out.println("Грешка: K трябва да бъде положително число по-малко или равно на N.");
            return;
        }

        // Четене на масива
        int[] array = new int[N];
        System.out.println("Въведете елементите на масива:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Намиране на K елемента с максимална сума
        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;

        for (int i = 0; i <= N - K; i++) {
            int currentSum = 0;
            for (int j = i; j < i + K; j++) {
                currentSum += array[j];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = i;
            }
        }

        // Отпечатване на K елемента с максимална сума
        System.out.println("K елемента с максимална сума са:");
        for (int i = startIndex; i < startIndex + K; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
