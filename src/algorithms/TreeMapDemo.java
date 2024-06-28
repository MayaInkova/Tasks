package algorithms;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo {
    // Примерен текст, който ще използваме за преброяване на думи
    private static final String TEXT = "Test text words Count " +
            "words count teSt";

    public static void main(String[] args) {
        // Създаваме карта с броя на думите в текста
        Map<String, Integer> wordsCounts = createWordsCounts(TEXT);
        // Отпечатваме броя на думите
        printWordsCount(wordsCounts);
    }

    //Създава карта с броя на думите в даден текст.

    private static Map<String, Integer> createWordsCounts(String text) {
        // Използваме Scanner за четене на думите в текста
        Scanner textScanner = new Scanner(text);
        // Създаваме TreeMap за съхранение на думите и техния брой
        Map<String, Integer> words = new TreeMap<String, Integer>();
        while (textScanner.hasNext()) {
            // Четем поредната дума
            String word = textScanner.next();
            // Получаваме текущия брой на думата (ако няма запис, връща null)
            Integer count = words.get(word);
            // Ако думата все още не е добавена в картата, започваме с 0
            if (count == null) {
                count = 0;
            }
            // Увеличаваме броя на думата с 1 и я добавяме в картата
            words.put(word, count + 1);
        }
        // Връщаме картата с думите и техния брой
        return words;
    }


     // Отпечатва броя на думите в картата.

    private static void printWordsCount(Map<String, Integer> wordsCounts) {
        // За всяка дума и нейния брой в картата, отпечатваме резултатите
        for (Map.Entry<String, Integer> wordEntry : wordsCounts.entrySet()) {
            System.out.printf(
                    "Думата '%s' се среща %d пъти в текста%n",
                    wordEntry.getKey(), wordEntry.getValue());
        }
    }
}

