package myFirstProject;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  the length of the first side:");
        double sideA = scanner.nextDouble();
        System.out.println("Enter the length of the second side");
        double sideB = scanner.nextDouble();

        double result = sideA * sideB;

        System.out.println("result:" + result);
    }

}
