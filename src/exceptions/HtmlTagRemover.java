package exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HtmlTagRemover {
    // Дефинираме името на входния файл и набора от символи като константи
    private static final String INPUT_FILE_NAME =

            "Problem1.html";

    private static final String CHARSET = "windows-1251";



    public static void main(String args[]) {

        Scanner scanner = null;

        try {
            // Инициализираме скенера със зададения файл и набор от символи


            scanner = new Scanner(

                    new File(INPUT_FILE_NAME), CHARSET);

            // Четем и обработваме файла ред по ред

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                line = removeAllTags(line); // Премахваме HTML таговете

                System.out.println(line); // Принтираме обработения ред

            }

        } catch (IOException ioex) {
            // Обработваме изключението, ако файлът не може да бъде прочетен

            System.err.println("Can read file " + INPUT_FILE_NAME);

            // Уверяваме се, че скенерът е затворен, за да освободим ресурсите

        } finally {

            if (scanner != null) {

                scanner.close();

            }

        }

    }

    // Метод за премахване на всички HTML тагове от низ

    private static String removeAllTags(String str) {
        // Замяна на всички HTML тагове с нов ред

        String strWithoutTags = str.replaceAll("<[^>]*>", "\n");

        return strWithoutTags;

    }

}

