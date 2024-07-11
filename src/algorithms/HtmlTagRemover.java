package algorithms;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HtmlTagRemover {
    // Име на файла, който ще бъде обработен
    private static final String INPUT_FILE_NAME = "Problem1.html";
    // Кодировка на файла
    private static final String CHARSET = "windows-1251";

    public static void main(String args[]) {
        Scanner scanner = null;

        try {
            // Инициализиране на Scanner обекта за четене на файла
            scanner = new Scanner(new File(INPUT_FILE_NAME), CHARSET);
            while (scanner.hasNextLine()) {
                // Четене на всяка линия от файла
                String line = scanner.nextLine();
                // Премахване на всички HTML тагове от линията
                line = removeAllTags(line);
                // Принтиране на изчистената линия
                System.out.println(line);
            }
        } catch (IOException ioex) {
            // Принтиране на съобщение за грешка, ако не може да се чете файла
            System.err.println("Не може да се прочете файлът " + INPUT_FILE_NAME);
        } finally {
            // Затваряне на Scanner обекта
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    // Метод за премахване на всички HTML тагове от даден низ
    private static String removeAllTags(String str) {
        // Замяна на HTML таговете с нов ред
        String strWithoutTags = str.replaceAll("<[^>]*>", "\n");
        return strWithoutTags;
    }
}
