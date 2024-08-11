package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueSortedList {

    // програма на Java, която чете списък от цели числа,
    // премахва всички дублиращи се числа и след това сортира списъка във възходящ ред.
    // Накрая програмата трябва да изведе резултата.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на вход от потребителя
        System.out.println("Въведете списък от числа, разделени със запетая:");
        String input = scanner.nextLine();

        // Разделяне на входа на числа
        String[] numbersStr = input.split(",");

        // Създаване на списък
        List<Integer> numbers = new ArrayList<>();

        // Добавяне на числата в списъка
        for (String numStr : numbersStr) {
            numbers.add(Integer.parseInt(numStr.trim()));
        }

        // Премахване на дубликати чрез използване на Set
        Set<Integer> uniqueNumbersSet = new HashSet<>(numbers);

        // Преобразуване обратно в списък
        List<Integer> uniqueNumbersList = new ArrayList<>(uniqueNumbersSet);

        // Сортиране на списъка
        Collections.sort(uniqueNumbersList);

        // Извеждане на резултата
        System.out.println("Уникални и сортирани числа: " + uniqueNumbersList);
    }
}
