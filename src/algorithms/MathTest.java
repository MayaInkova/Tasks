package algorithms;

import java.util.Scanner;

//програма, която пресмята лицето на триъгълник по дадени дължини на две от страните
// и ъгъла между тях в градуси. За тази цел имаме нужда от методите sin(…) и toRadians(…) на класа Math.
public class MathTest {

    public static void main(String[] args) {

        // Създаваме обект от клас Scanner за четене на вход от потребителя
        Scanner input = new Scanner(System.in);

        // Молим потребителя да въведе дължината на първата страна
        System.out.println("Length of the first side:");
        double a = input.nextDouble(); // Четем стойността и я запазваме в променлива 'a'

        // Молим потребителя да въведе дължината на втората страна
        System.out.println("Length of the second side:");
        double b = input.nextDouble(); // Четем стойността и я запазваме в променлива 'b'

        // Молим потребителя да въведе големината на ъгъла в градуси
        System.out.println("Size of the angle in degrees:");
        int angle = input.nextInt(); // Четем стойността и я запазваме в променлива 'angle'

        // Изчисляваме лицето на триъгълника използвайки формулата 0.5 * a * b * sin(ъгъл в радиани)
        double area = 0.5 * a * b * Math.sin(Math.toRadians(angle));

        // Отпечатваме лицето на триъгълника
        System.out.printf("Face of the triangle: %f%n", area);
    }


}
