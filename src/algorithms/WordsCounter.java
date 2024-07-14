package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsCounter {
    public static void main(String[] args) throws FileNotFoundException {
        // Създаване на HashMap за думите и техните броячи
        HashMap<String, Integer> wordsCount = new HashMap<>();

        // Четене на думите от words.txt
        Scanner wordsFile = new Scanner(new File("words.txt"));
        while (wordsFile.hasNextLine()) {
            wordsCount.put(wordsFile.nextLine().toLowerCase(), 0);
        }
        wordsFile.close();

        // Четене на думите от sample.txt и преброяване
        Scanner sampleFile = new Scanner(new File("sample.txt"));
        while (sampleFile.hasNext()) {
            String sampleWord = sampleFile.next().toLowerCase();
            if (wordsCount.containsKey(sampleWord)) {
                wordsCount.put(sampleWord, wordsCount.get(sampleWord) + 1);
            }
        }
        sampleFile.close();

        // Записване на резултатите в result.txt
        PrintStream resultFile = new PrintStream("result.txt");
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            resultFile.format("%s - %d%n", entry.getKey(), entry.getValue());
        }
        resultFile.close();
    }
}

