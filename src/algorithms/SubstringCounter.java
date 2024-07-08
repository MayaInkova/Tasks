package algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SubstringCounter {

    // Метод за броене на всички поднизове в даден текст
    public static Map<String, Integer> countSubstrings(String text) {
        Map<String, Integer> substringCounts = new HashMap<>(); // Хеш таблица за съхранение на поднизовете и техните срещания

        int length = text.length(); // Дължината на текста
        // Два вложени цикъла за генериране на всички поднизове
        for (int start = 0; start < length; start++) {
            for (int end = start + 1; end <= length; end++) {
                String substring = text.substring(start, end); // Извличане на подниз от текста
                // Увеличаване на броя на срещанията на текущия подниз
                substringCounts.put(substring, substringCounts.getOrDefault(substring, 0) + 1);
            }
        }

        return substringCounts; // Връщане на хеш таблицата с броенето на поднизовете
    }

    // Метод за четене на текстов файл и връщане на съдържанието му като низ
    public static String readFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder(); // StringBuilder за събиране на съдържанието на файла
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n"); // Добавяне на всеки ред от файла към StringBuilder-а
            }
        }
        return content.toString(); // Връщане на съдържанието на файла като един цял низ
    }

    // Главен метод на програмата
    public static void main(String[] args) {
        if (args.length != 1) { // Проверка дали е подаден един аргумент (името на файла)
            System.out.println("Usage: java SubstringCounter <filename>");
            return;
        }

        String filename = args[0]; // Получаване на името на файла от аргументите
        try {
            String text = readFile(filename).trim(); // Четене и почистване на съдържанието на файла
            Map<String, Integer> substringCounts = countSubstrings(text); // Броене на поднизовете

            // Принтиране на всички поднизове и техните брояния
            for (Map.Entry<String, Integer> entry : substringCounts.entrySet()) {
                System.out.println("Substring: \"" + entry.getKey() + "\", Count: " + entry.getValue());
            }
        } catch (IOException e) { // Обработка на евентуални грешки при четене на файла
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
