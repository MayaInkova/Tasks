package algorithms;

import java.util.HashSet;
import java.util.Scanner;

//програма , която приема текст като вход и извежда всички уникални думи от този текст.
// Думите в текста са разделени със интервали, а пунктуационните знаци се игнорират.
// Програмата трябва да разглежда думите като еднакви, независимо
// от това дали са написани с главни или малки букви (например "Java" и "java" се считат за една и съща дума).

public class UniqueWords {
    public static void main(String[] args) {
        // Сканер за въвеждане на текст от конзолата
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на текст
        System.out.println("Въведете текст:");
        String input = scanner.nextLine();

        // Преобразуване на текста в малки букви и премахване на пунктуационните знаци

        String cleanedInput = input.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "");

        // Разделяне на текста на думи
        String[] words = cleanedInput.split("\\s+");

        // Създаване на HashSet за съхраняване на уникалните думи
        HashSet<String> uniqueWords = new HashSet<>();

        // Добавяне на думите в HashSet
        for (String word : words) {
            if (!word.isEmpty()) {
                uniqueWords.add(word);
            }
        }

        // Извеждане на уникалните думи
        System.out.println("Уникални думи в текста:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
