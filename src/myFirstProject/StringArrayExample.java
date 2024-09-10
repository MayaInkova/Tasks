package myFirstProject;

import java.util.Scanner;

public class StringArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[5];

        //Показваме на потребителя да въведе 5 низа
        System.out.println("Enter 5 strings separated by a space: ");
        String input = scanner.nextLine();

        //Разделяме входния низ на отделни низове и ги записваме в масив
        strings = input.split(" ", 5);

        System.out.println("The strings entered are:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}