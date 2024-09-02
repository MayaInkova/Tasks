package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetMapExample {
    public static void main(String[] args) {
        // Създаваме Set за съхранение на уникални елементи
        Set<String> mySet = new HashSet<>();

        // Добавяме елементи в Set
        mySet.add("Ябълка");
        mySet.add("Банан");
        mySet.add("Портокал");

        // Проверяваме дали даден елемент съществува в Set
        if (mySet.contains("Банан")) {
            System.out.println("Банан е в множеството.");
        }

        // Премахваме елемент от Set
        mySet.remove("Портокал");

        // Извеждаме всички елементи от Set
        System.out.println("Елементи в множеството: " + mySet);

        // Създаваме Map за съхранение на двойки "ключ-стойност"
        Map<String, Integer> myMap = new HashMap<>();

        // Добавяме двойки ключ-стойност в Map
        myMap.put("Ябълка", 10);
        myMap.put("Банан", 20);
        myMap.put("Портокал", 30);

        // Получаваме стойност по ключ
        int bananaQuantity = myMap.get("Банан");
        System.out.println("Количество банани: " + bananaQuantity);

        // Премахваме елемент по ключ от Map
        myMap.remove("Портокал");

        // Извеждаме всички ключове и стойности от Map
        System.out.println("Съдържание на Map: " + myMap);
    }
}
