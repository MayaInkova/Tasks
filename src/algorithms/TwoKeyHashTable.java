package algorithms;

import java.util.HashMap;
import java.util.Map;
// хеш-таблица, която съхранява тройки стойности
// (ключ1, ключ2, стойност) и позволява бързо търсене по двойка ключове и добавяне на тройки стойности.

public class TwoKeyHashTable <K1, K2, V> {
    // Външна хеш-таблица, която използва първия ключ
    private Map<K1, Map<K2, V>> map = new HashMap<>();

    // Метод за добавяне на тройка (ключ1, ключ2, стойност)
    public void put(K1 key1, K2 key2, V value) {
        // Получаване на вътрешната хеш-таблица, асоциирана с key1
        Map<K2, V> innerMap = map.get(key1);
        if (innerMap == null) {
            // Ако вътрешната хеш-таблица не съществува, създаваме нова
            innerMap = new HashMap<>();
            map.put(key1, innerMap);
        }
        // Добавяне на стойността във вътрешната хеш-таблица с ключ key2
        innerMap.put(key2, value);
    }

    // Метод за извличане на стойност по двойка ключове (ключ1 и ключ2)
    public V get(K1 key1, K2 key2) {
        // Получаване на вътрешната хеш-таблица, асоциирана с key1
        Map<K2, V> innerMap = map.get(key1);
        if (innerMap == null) {
            // Ако вътрешната хеш-таблица не съществува, връщаме null
            return null;
        }
        // Връщане на стойността, асоциирана с key2
        return innerMap.get(key2);
    }

    // Метод за премахване на стойност по двойка ключове (ключ1 и ключ2)
    public V remove(K1 key1, K2 key2) {
        // Получаване на вътрешната хеш-таблица, асоциирана с key1
        Map<K2, V> innerMap = map.get(key1);
        if (innerMap == null) {
            // Ако вътрешната хеш-таблица не съществува, връщаме null
            return null;
        }
        // Премахване на стойността, асоциирана с key2
        V value = innerMap.remove(key2);
        // Ако вътрешната хеш-таблица е празна след премахването, премахваме я от външната хеш-таблица
        if (innerMap.isEmpty()) {
            map.remove(key1);
        }
        return value;
    }

    // Метод за проверка дали съществува двойка ключове (ключ1 и ключ2)
    public boolean containsKeys(K1 key1, K2 key2) {
        // Получаване на вътрешната хеш-таблица, асоциирана с key1
        Map<K2, V> innerMap = map.get(key1);
        if (innerMap == null) {
            // Ако вътрешната хеш-таблица не съществува, връщаме false
            return false;
        }
        // Връщане на резултата от проверката дали съществува ключ key2 във вътрешната хеш-таблица
        return innerMap.containsKey(key2);
    }

    // Метод за проверка дали хеш-таблицата е празна
    public boolean isEmpty() {
        return map.isEmpty();
    }

    // Метод за изчистване на хеш-таблицата
    public void clear() {
        map.clear();
    }

    public static void main(String[] args) {
        TwoKeyHashTable<String, String, Double> table = new TwoKeyHashTable<>();

        // Добавяне на тройки стойности
        table.put("Пешо", "Математика", 5.00);
        table.put("Пешо", "История", 4.50);
        table.put("Гошо", "Математика", 6.00);
        table.put("Гошо", "История", 5.50);

        // Извличане на стойности
        System.out.printf("Оценката на Пешо по Математика: %.2f%n", table.get("Пешо", "Математика"));
        System.out.printf("Оценката на Гошо по История: %.2f%n", table.get("Гошо", "История"));

        // Проверка за съществуване на ключове
        System.out.printf("Пешо има ли оценка по История: %b%n", table.containsKeys("Пешо", "История"));
        System.out.printf("Пешо има ли оценка по Биология: %b%n", table.containsKeys("Пешо", "Биология"));

        // Премахване на стойност
        System.out.printf("Премахната оценка на Пешо по История: %.2f%n", table.remove("Пешо", "История"));
        System.out.printf("Пешо има ли оценка по История след премахването: %b%n", table.containsKeys("Пешо", "История"));

        // Проверка дали хеш-таблицата е празна
        System.out.printf("Хеш-таблицата празна ли е: %b%n", table.isEmpty());

        // Изчистване на хеш-таблицата
        table.clear();
        System.out.printf("Хеш-таблицата празна ли е след изчистването: %b%n", table.isEmpty());
    }
}
