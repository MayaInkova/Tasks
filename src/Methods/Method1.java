package Methods;

import java.util.Scanner;

//  Напишете метод, който при подадено име отпечатва
//  в конзолата "Hello, <name>!" (например "Hello, Peter!").
//  Напишете програма, която тества този метод.
public class Method1 {
    public static void main(String[] args) {
        printHello("Petur");
        printHello("Ivan");



    }
    public  static  void printHello (String name) {
        System.out.println("Hello" + name + "!");
    }
}
