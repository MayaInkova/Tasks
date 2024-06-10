package arrays;
//програма, която чете два масива от конзолата и проверява дали са еднакви.
import java.util.Arrays;
import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на първия масив
        System.out.print("Въведете броя на елементите в първия масив: ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        System.out.println("Въведете елементите на първия масив:");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
      }

        // Четене на втория масив
        System.out.print("Въведете броя на елементите във втория масив: ");
        int m = scanner.nextInt();
        int[] array2 = new int[m];
        System.out.println("Въведете елементите на втория масив:");
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();
        }

        // Проверка дали масивите са еднакви
        boolean areEqual = Arrays.equals(array1, array2);

        // Отпечатване на резултата
        if (areEqual) {
            System.out.println("Масивите са еднакви.");
        } else {
            System.out.println("Масивите не са еднакви.");
        }
    }
}
