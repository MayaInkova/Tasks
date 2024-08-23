package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Имаме списък от N цели числа. Целта е да сортирам списъка по следния начин:
//Всички четни числа трябва да са подредени в нарастващ ред.
//Всички нечетни числа трябва да са подредени в намаляващ ред.
//Четните числа трябва да бъдат поставени преди нечетните.
public class DoubleSort {

    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 7, 10, 5, 8};

        // Създаваме два списъка за четни и нечетни числа
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        // Разделяме числата на четни и нечетни
        for (int number : numbers) {
            if (number % 2 == 0) {
                evens.add(number);
            } else {
                odds.add(number);
            }
        }

        // Сортираме четните числа във възходящ ред
        Collections.sort(evens);

        // Сортираме нечетните числа в низходящ ред
        Collections.sort(odds, Collections.reverseOrder());

        // Обединяваме двата списъка
        List<Integer> result = new ArrayList<>();
        result.addAll(evens);
        result.addAll(odds);

        // Принтираме резултата
        System.out.println("Сортираният списък: " + result);
    }

}
