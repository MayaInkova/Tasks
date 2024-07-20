package exceptions;

import java.io.*;

//Този код демонстрира как да се чете файл в Java,
// като същевременно се обработват потенциални грешки, които могат да възникнат по време на процеса на четене.
public class ReadFileExsample {
    public static void readFile(String fileName) {
        try {
            // Възможни изключения могат да бъдат хвърлени тук
            FileInputStream fis = new FileInputStream(fileName);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            fis.close();
        } catch (FileNotFoundException e) {
            // Обработчик на изключение за FileNotFoundException
            // Само информираме потребителя, че такъв файл не съществува
            System.out.println("Файлът \"" + fileName + "\" не съществува! Невъзможно е да се прочете.");
        } catch (IOException e) {
            // Обработчик на изключение за IOException
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //Вика метода readFile с пътя до файла C:\\tools\\eclipse\\eclipse.ini
        readFile("C:\\tools\\eclipse\\eclipse.ini");

    }

}
