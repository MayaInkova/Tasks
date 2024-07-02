package algorithms;

import java.util.*;

//Програма, която премахва всички числа, които се срещат нечетен брой пъти в дадена редица.
// Например, ако имаме началната редица {4, 2, 2, 5, 2, 3, 2, 3, 1, 5, 2, 6, 6, 6},
// трябва да я редуцираме до редицата {5, 3, 3, 5}.

public class RemoveOddFrequencies {
    public static List<Integer> removeOddFrequencies(List<Integer> sequence) {
        // Стъпка 1: Преброяване на честотата на всяко число в редицата
        Map<Integer, Integer> frequency = new HashMap<>();
        for (Integer number : sequence) {
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        }

        // Стъпка 2: Създаване на нова редица с числата, които се срещат четен брой пъти
        List<Integer> result = new ArrayList<>();
        for (Integer number : sequence) {
            if (frequency.get(number) % 2 == 0) {
                result.add(number);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Примерна редица
        List<Integer> sequence = Arrays.asList(4, 2, 2, 5, 2, 3, 2, 3, 1, 5, 2, 6, 6, 6);

        // Премахване на числата, които се срещат нечетен брой пъти
        List<Integer> reducedSequence = removeOddFrequencies(sequence);

        // Отпечатване на резултата
        System.out.println(reducedSequence);
    }
}

