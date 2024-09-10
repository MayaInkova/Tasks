package myFirstProject;

import java.util.Scanner;

public class myFirstClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= scanner.nextLine();
        System.out.println("Enter your years:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your birthDay:");
        String birthday = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("BirthDay: " + birthday);
    }



    }

