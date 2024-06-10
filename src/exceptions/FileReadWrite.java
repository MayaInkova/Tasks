package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//метод, който приема като параметър име на бинарен файл и
// прочита съдържанието на файла и го връща като масив от байтове, записва прочетеното съдържание в друг файл.
public class FileReadWrite {
    // Метод за четене на съдържанието на бинарен файл и връщане като масив от байтове
    public static byte[] readFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);

        byte[] content = new byte[(int) file.length()];
        fis.read(content);

        fis.close();

        return content;
    }

    // Метод за записване на съдържанието в друг файл
    public static void writeFile(byte[] content, String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(content);
        fos.close();
    }

    public static void main(String[] args) {
        try {
            // Четене на съдържанието на бинарен файл
            byte[] content = readFile("input.bin");

            // Записване на съдържанието в друг файл
            writeFile(content, "output.bin");

            System.out.println("Файлът е прочетен и записан успешно.");
        } catch (IOException e) {
            System.out.println("Грешка при работа с файлове: " + e.getMessage());
        }
    }
}
