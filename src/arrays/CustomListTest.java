package arrays;

public class CustomListTest {
    public static void main(String[] args) {
        // Тест за добавяне на елемент
        CustomList<Integer> list = new CustomList<>();
        list.addElement(10);
        list.addElement(20);
        if (list.getSize() == 2) {
            System.out.println("Тестът за добавяне на елемент е успешен!");
        } else {
            System.out.println("Тестът за добавяне на елемент е НЕуспешен.");
        }

        // Тест за премахване на елемент
        boolean removed = list.removeElement(10);
        if (removed && list.getSize() == 1) {
            System.out.println("Тестът за премахване на елемент е успешен!");
        } else {
            System.out.println("Тестът за премахване на елемент е НЕуспешен.");
        }

        // Тест за извличане на елемент по индекс
        try {
            int element = list.getElement(0);
            if (element == 20) {
                System.out.println("Тестът за извличане на елемент по индекс е успешен!");
            } else {
                System.out.println("Тестът за извличане на елемент по индекс е НЕуспешен.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Тестът за извличане на елемент по индекс е НЕуспешен: " + e.getMessage());
        }

        // Тест за максимален елемент
        list.addElement(15);
        int maxElement = list.getMax();
        if (maxElement == 20) {
            System.out.println("Тестът за максимален елемент е успешен!");
        } else {
            System.out.println("Тестът за максимален елемент е НЕуспешен.");
        }

        // Тест за извличане на елемент с невалиден индекс
        try {
            list.getElement(10); // Трябва да хвърли изключение
            System.out.println("Тестът за невалиден индекс е НЕуспешен.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Тестът за невалиден индекс е успешен: " + e.getMessage());
        }
    }
}
