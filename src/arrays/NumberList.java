package arrays;

//Програма, която обработва списък от цели числа. Програмата трябва да предоставя следните функции:
//Добавяне на число в списъка.
//Премахване на число от списъка.
//Намиране на минималното и максималното число в списъка.
//Изчисляване на средната стойност на всички числа в списъка.
//Извеждане на всички числа в списъка.

import java.util.ArrayList;
import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        // Създаваме списък за съхранение на числата
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Меню с опции
            System.out.println("\n1. Добави число");
            System.out.println("2. Премахни число");
            System.out.println("3. Намери минимално и максимално число");
            System.out.println("4. Изчисли средна стойност");
            System.out.println("5. Покажи всички числа");
            System.out.println("6. Изход");
            System.out.print("Изберете опция: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Добавяне на число в списъка
                    System.out.print("Въведете число за добавяне: ");
                    int numberToAdd = scanner.nextInt();
                    numbers.add(numberToAdd);
                    System.out.println("Числото е добавено успешно.");
                    break;

                case 2:
                    // Премахване на число от списъка
                    System.out.print("Въведете число за премахване: ");
                    int numberToRemove = scanner.nextInt();
                    if (numbers.remove(Integer.valueOf(numberToRemove))) {
                        System.out.println("Числото е премахнато успешно.");
                    } else {
                        System.out.println("Числото не беше намерено в списъка.");
                    }
                    break;

                case 3:
                    // Намиране на минимално и максимално число
                    if (!numbers.isEmpty()) {
                        int min = numbers.get(0);
                        int max = numbers.get(0);
                        for (int num : numbers) {
                            if (num < min) min = num;
                            if (num > max) max = num;
                        }
                        System.out.println("Минимално число: " + min);
                        System.out.println("Максимално число: " + max);
                    } else {
                        System.out.println("Списъкът е празен.");
                    }
                    break;

                case 4:
                    // Изчисляване на средната стойност
                    if (!numbers.isEmpty()) {
                        int sum = 0;
                        for (int num : numbers) {
                            sum += num;
                        }
                        double average = sum / (double) numbers.size();
                        System.out.println("Средната стойност е: " + average);
                    } else {
                        System.out.println("Списъкът е празен.");
                    }
                    break;

                case 5:
                    // Извеждане на всички числа
                    System.out.println("Числата в списъка са: " + numbers);
                    break;

                case 6:
                    // Изход от програмата
                    System.out.println("Изход от програмата.");
                    break;

                default:
                    System.out.println("Невалидна опция. Опитайте отново.");
                    break;
            }
        } while (choice != 6);

    }
}

