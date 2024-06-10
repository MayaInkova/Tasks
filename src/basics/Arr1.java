package basics;

import java.util.Scanner;

//Да се напише програма, която чете два масива от конзолата и провerрява дали са еднакви.
public class Arr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на първия масив
        System.out.print("Въведете броя на елементите за първия масив: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Въведете елементите на първия масив:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Четене на втория масив
        System.out.print("Въведете броя на елементите за втория масив: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Въведете елементите на втория масив:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Проверка дали масивите са еднакви
        boolean areEqual = areArraysEqual(array1, array2);

        // Извеждане на резултата
        if (areEqual) {
            System.out.println("Масивите са еднакви.");
        } else {
            System.out.println("Масивите не са еднакви.");
        }


    }

    // Метод за проверка дали два масива са еднакви
    private static boolean areArraysEqual(int[] array1, int[] array2) {
        // Проверка дали дължините на масивите са различни
        if (array1.length != array2.length) {
            return false;
        }

        // Проверка на всеки елемент
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return  true;

    }
}

