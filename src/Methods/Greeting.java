package Methods;

import java.util.Scanner;
//метод, който при подадено име отпечатва в конзолата "Hello, <name>!" (например "Hello, Peter!"). Напишете програма, която тества този метод.
public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Моля, въведете вашето име: ");
        String name = scanner.nextLine();

        greet(name);
    }

    // Метод за приветствие
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
