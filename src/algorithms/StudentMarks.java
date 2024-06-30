package algorithms;

import java.util.HashMap;
import java.util.Map;

//Имаме студенти. Всеки от тях би могъл да има най-много една оценка.
// Искаме да съхраняваме оценките в някаква структура, в която можем бързо да търсим по име на студент.

public class StudentMarks {
    public static void main(String[] args) {
        // Създаване на HashMap с капацитет 6
        Map<String, Double> studentsNarks = new HashMap<String, Double>(6);

        // Добавяне на студенти и техните оценки
        studentsNarks.put("Пешо", 3.00);
        studentsNarks.put("Гошо", 4.50);
        studentsNarks.put("Наков", 5.50);
        studentsNarks.put("Веско", 3.50);
        studentsNarks.put("Цанев", 4.00);
        studentsNarks.put("Нърди", 6.00);

        // Извличане и показване на оценката на Цанев
        Double tsanevMark = studentsNarks.get("Цанев");
        System.out.printf("Оценката на Цанев: %.2f %n", tsanevMark);

        // Премахване на Цанев от HashMap
        studentsNarks.remove("Цанев");
        System.out.println("Цанев премахнат.");

        // Проверка дали Цанев все още съществува в HashMap
        System.out.printf("Цанев е в хеш таблицата: %b %n", studentsNarks.containsKey("Цанев"));

        // Промяна на оценката на Нърди
        studentsNarks.put("Нърди", 3.25);
        System.out.println("Оценката на Нърди променена.");

        // Извеждане на всички студенти и техните оценки
        System.out.println("Студенти и оценки:");
        for (Map.Entry<String, Double> studentMark : studentsNarks.entrySet()) {
            System.out.printf("%s има %.2f%n", studentMark.getKey(), studentMark.getValue());
        }

        // Показване на броя на студентите
        System.out.printf("Има %d студенти.%n", studentsNarks.size());

        // Изчистване на HashMap и проверка дали е празен
        studentsNarks.clear();
        System.out.println("Хеш мапът със студенти е изчистен.");
        System.out.printf("Хеш таблицата е празна: %b%n", studentsNarks.isEmpty());
    }
}

