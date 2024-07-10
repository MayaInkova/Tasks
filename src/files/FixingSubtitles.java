package files;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.PrintStream;

import java.io.UnsupportedEncodingException;

import java.util.Scanner;



public class FixingSubtitles {
    // Дефиниране на константи
    private static final int COEFFICIENT = 2; // Коефициент за умножение на времето
    private static final int ADDITION = 5000; // Добавка към времето
    private static final String INPUT_FILE = "GORA.sub"; // Входен файл
    private static final String OUTPUT_FILE = "fixed.sub"; // Изходен файл

    public static void main(String[] args) {
        Scanner fileInput = null;
        PrintStream fileOutput = null;

        try {
            // Създаване на скенер с кирилска кодировка
            fileInput = new Scanner(new File(INPUT_FILE), "windows-1251");
            // Създаване на PrintWriter с кирилска кодировка
            fileOutput = new PrintStream(OUTPUT_FILE, "windows-1251");

            String line;
            // Четене на редове от входния файл
            while (fileInput.hasNextLine()) {
                line = fileInput.nextLine();
                // Фиксиране на реда
                String fixedLine = fixLine(line);
                // Записване на фиксирания ред в изходния файл
                fileOutput.println(fixedLine);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println(fnfe.getMessage());
        } catch (UnsupportedEncodingException uee) {
            System.err.println(uee.getMessage());
        } finally {
            // Затваряне на скенера
            if (null != fileInput) {
                fileInput.close();
            }
            // Затваряне на PrintWriter
            if (null != fileOutput) {
                fileOutput.close();
            }
        }
    }

    private static String fixLine(String line) {
        // Намиране на затварящата скоба
        int bracketFromIndex = line.indexOf('}');

        // Извличане на 'from' време
        String fromTime = line.substring(1, bracketFromIndex);

        // Изчисляване на ново 'from' време
        int newFromTime = Integer.parseInt(fromTime) * COEFFICIENT + ADDITION;

        // Намиране на следващата затваряща скоба
        int bracketToIndex = line.indexOf('}', bracketFromIndex + 1);

        // Извличане на 'to' време
        String toTime = line.substring(bracketFromIndex + 2, bracketToIndex);

        // Изчисляване на ново 'to' време
        int newToTime = Integer.parseInt(toTime) * COEFFICIENT + ADDITION;

        // Създаване на нов ред с новите 'from' и 'to' времена
        String fixedLine = "{" + newFromTime + "}" + "{" + newToTime + "}" + line.substring(bracketToIndex + 1);

        return fixedLine;
    }

}
