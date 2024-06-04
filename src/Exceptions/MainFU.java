package Exceptions;

import java.io.IOException;

import static Exceptions.FileUtil.readFileToByteArray;
import static Exceptions.FileUtil.writeByteArrayToFile;

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
