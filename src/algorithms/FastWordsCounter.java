package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class FastWordsCounter {
    public static void main(String[] args)
        // Деклариране, че методът може да хвърли изключение FileNotFoundException
            throws FileNotFoundException {

        // Създаване на нов ArrayList за съхранение на думите
        ArrayList<String> words = new ArrayList<String>();

        // Създаване на нова Hashtable за съхранение на броя на всяка дума
        Hashtable<String, Integer> wordsCount = new Hashtable<String, Integer>();

        // Четене на файла words.txt
        Scanner wordsFile = new Scanner(new File("words.txt"));

        // Четене на всяка дума от файла words.txt
        while (wordsFile.hasNextLine()) {
            String word = wordsFile.nextLine().toLowerCase(); // Четене на дума и преобразуване в малки букви
            words.add(word); // Добавяне на думата в списъка words
            wordsCount.put(word, 0); // Добавяне на думата в таблицата wordsCount със стойност 0
        }
        wordsFile.close(); // Затваряне на файла words.txt

        // Четене на файла sample.txt
        Scanner sampleFile = new Scanner(new File("sample.txt"));

        // Четене на всяка дума от файла sample.txt
        while (sampleFile.hasNext()) {
            String word = sampleFile.next().toLowerCase(); // Четене на дума и преобразуване в малки букви
            Integer count = wordsCount.get(word); // Получаване на текущия брой на думата от таблицата
            if (count != null) { // Проверка дали думата съществува в таблицата
                wordsCount.put(word, count + 1); // Увеличаване на броя на думата с 1
            }
        }
        sampleFile.close(); // Затваряне на файла sample.txt

        // Писане на резултатите в result.txt
        PrintStream resultFile = new PrintStream("result.txt");
        for (String word : words) {
            int count = wordsCount.get(word); // Получаване на броя на думата от таблицата
            resultFile.format("%s - %s%n", word, count); // Записване на думата и броя й във файла result.txt
        }
        resultFile.close(); // Затваряне на файла result.txt
    }

}

