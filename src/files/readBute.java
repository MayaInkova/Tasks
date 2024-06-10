package files;

import java.io.FileInputStream;
import java.io.IOException;

// четене на byte po byte
public class readBute {
    public static void main(String[] args) throws IOException {

        String path = "input txt";
        FileInputStream inputStream= new FileInputStream(path);
        int readByte = inputStream.read();
        while (readByte>=0 ) {
            System.out.println(Integer.toBinaryString(readByte)+ " ");
            readByte = inputStream.read();
        }
    }
}
