package algorithms;

import java.util.Set;
import java.util.TreeSet;

//програма , която приема списък от цели числа (например от потребителския вход или предварително зададен масив)
// и премахва всички дубликати, като запазва уникалните числа.
// След това програмата трябва да изведе уникалните числа в нарастващ ред.

public class UniqueNumbers {
    public static void main(String[] args) {
        // Примерен масив с числа
        int[] numbers = {1, 3, 5, 3, 7, 9, 1, 5};

        // Използваме TreeSet, за да премахнем дубликатите и да сортираме числата
        Set<Integer> uniqueNumbers = new TreeSet<>();

        // Добавяме числата от масива в Set-а
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        // Принтираме уникалните числа
        System.out.println("Уникалните числа са: " + uniqueNumbers);
    }
}
