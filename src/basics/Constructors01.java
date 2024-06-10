package basics;

//Да се напише if-конструкция, която изчислява стойността на две целочислени променливи и разменя техните стойности,
// ако стойността на първата променлива е по-голяма от втората.

public class Constructors01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Проверка дали a е по-голямо от b
        if (a > b) {
            // Размяна на стойностите
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


