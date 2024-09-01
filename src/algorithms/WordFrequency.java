package algorithms;


import java.util.HashMap;
import java.util.Map;

//Програма, която приема текстов низ (string) и преброява колко пъти се среща всяка дума в него,
// като резултатите се съхраняват в Map.
public class WordFrequency {
    public static void main(String[] args) {
        String text = "Това е примерен текст. Този текст има няколко думи и някои думи се повтарят, като думата текст.";

        // Премахваме пунктуацията и превръщаме текста в малки букви
        text = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").toLowerCase();

        // Разделяме текста на думи
        String[] words = text.split("\\s+");

        // Създаваме Map за съхранение на честотата на думите
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Обхождаме всяка дума
        for (String word : words) {
            // Ако думата вече съществува в Map-а, увеличаваме стойността й с 1
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // Ако думата не съществува в Map-а, добавяме я със стойност 1
                wordCountMap.put(word, 1);
            }
        }

        // Принтираме резултатите
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

