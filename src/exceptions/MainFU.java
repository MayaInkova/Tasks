package exceptions;

import java.io.IOException;

import static exceptions.FileUtil.readFileToByteArray;
import static exceptions.FileUtil.writeByteArrayToFile;

public class MainFU {
    public static void main(String[] args) {
        String inputFilename = "example.zip";
        String outputFilename = "example_copy.zip";

        try {
            byte[] fileData = readFileToByteArray(inputFilename);
            writeByteArrayToFile(fileData, outputFilename);
            System.out.println("File has been copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
