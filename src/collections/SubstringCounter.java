package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SubstringCounter {
    public static void main(String[] args) {
        String filePath = "text.txt";
        try {
            String text = readFile(filePath);
            Map<String, Integer> substringCounts = countSubstrings(text);
            printSubstringCounts(substringCounts);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
//Четене на файла
    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
//Създаване на поднизове и броенето им:
    private static Map<String, Integer> countSubstrings(String text) {
        Map<String, Integer> substrCount = new HashMap<>();
        int textLength = text.length();

        for (int start = 0; start < textLength; start++) {
            for (int end = start + 1; end <= textLength; end++) {
                String substring = text.substring(start, end);
                substrCount.put(substring, substrCount.getOrDefault(substring, 0) + 1);
            }
        }

        return substrCount;
    }
//Отпечатване на резултатите:
    private static void printSubstringCounts(Map<String, Integer> substringCounts) {
        for (Map.Entry<String, Integer> entry : substringCounts.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\": " + entry.getValue());
        }
    }
}