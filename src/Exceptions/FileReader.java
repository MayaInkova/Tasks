package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
//метод, който приема като параметър име на текстов файл и прочита съдържанието му и го връща като String.
public class FileReader extends Reader {
    public FileReader(String fileName) {
    }

    // Метод за четене на съдържанието на текстов файл и връщане като String
    public static String readFileAsString(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            content.append(line);
            content.append("\n"); // Добавяне на нов ред
        }

        bufferedReader.close();

        // Превръщане на StringBuilder обекта в String и връщане
        return content.toString();
    }

    public static void main(String[] args) {
        try {
            // Четене на съдържанието на текстов файл
            String content = readFileAsString("example.txt");

            System.out.println("Съдържанието на файла:");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Грешка при работа с файлове: " + e.getMessage());
        }
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}
