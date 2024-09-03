package algorithms;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


// програма, която чете списък от цели числа, премахва дубликатите и извежда числата в сортиран ред.
public class UniqueSortedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>();

        System.out.println("Въведете числата, разделени с интервал:");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        for (String part : parts) {
            try {
                int number = Integer.parseInt(part);
                numbers.add(number);  // Добавя числото в множеството
            } catch (NumberFormatException e) {
                System.out.println(part + " не е валидно число.");
            }
        }

        System.out.println("Сортирани числа без дубликати:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
