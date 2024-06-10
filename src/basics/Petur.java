package basics;

import java.util.Scanner;

public class Petur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        System.out.printf("I am %s, %s years old.", name ,age);
    }
}
