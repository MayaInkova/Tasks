package methods;

import java.util.HashMap;
import java.util.Map;


//Намиране на най-често срещаното число в масив
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 1, 3, 2, 1};
        System.out.println(findMostFrequentNumber(numbers)); // Output: 1

        int[] numbers2 = {4, 5, 6, 5, 4, 5, 4};
        System.out.println(findMostFrequentNumber(numbers2)); // Output: 4

        int[] numbers3 = {};
        System.out.println(findMostFrequentNumber(numbers3)); // Output: -1
    }

    //Метод за намиране на най-често срещаното число в масив.
    public static int findMostFrequentNumber(int[] numbers) {
        // // Проверка дали масивът е празен
        if (numbers.length == 0) {
            return -1; // Връща -1, ако масивът е празен
        }

        // Създаване на карта за съхранение на честотата на числата
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {

            // Увеличаване на брояча за текущото число
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // Инициализация на променливи за най-често срещаното число и максимална честота
        int mostFrequentNumber = numbers[0];
        int maxFrequency = 0;

        // Обхождане на картата с числата и техните честоти
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            // Проверка дали текущото число има по-голяма честота или е по-малко при равни честоти
            if (frequency > maxFrequency || (frequency == maxFrequency && number < mostFrequentNumber)) {
                maxFrequency = frequency;
                mostFrequentNumber = number;
            }
        }
        // Връщане на най-често срещаното число
        return mostFrequentNumber;
    }
}