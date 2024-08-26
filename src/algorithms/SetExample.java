package algorithms;

import java.util.HashSet;
import java.util.Set;

//множество от числа  които добавяме, премахваме и проверяваме дали даден елемент се съдържа в множеството.

public class SetExample {
    public static void main(String[] args) {
        // Създаване на Set (множество) от цели числа
        Set<Integer> numbers = new HashSet<>();

        // Добавяне на елементи към множеството
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1); // Опит за добавяне на дубликат

        // Печат на множеството
        System.out.println("Съдържание на множеството: " + numbers);

        // Проверка дали даден елемент съществува в множеството
        if (numbers.contains(2)) {
            System.out.println("Числото 2 е в множеството.");
        }

        // Премахване на елемент от множеството
        numbers.remove(2);
        System.out.println("Съдържание на множеството след премахване на 2: " + numbers);

        // Печат на размера на множеството
        System.out.println("Размер на множеството: " + numbers.size());
    }
}

