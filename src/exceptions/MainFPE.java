package exceptions;

import java.io.BufferedReader;
import java.io.IOException;

public class MainFPE {

        public static void main(String[] args) {
            String filename = "example.txt";
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                int lineNumber = 0;

                while ((line = reader.readLine()) != null) {
                    lineNumber++;
                    if (line.contains("error")) { // Примерно условие за грешка
                        throw new FileParseException("Error parsing line", filename, lineNumber);
                    }
                    System.out.println(line);
                }
            } catch (FileParseException e) {
                System.err.println("Caught FileParseException: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Caught IOException: " + e.getMessage());
            }
        }
    }

