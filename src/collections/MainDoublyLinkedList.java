package collections;

public class MainDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // Добавяне на елементи
        list.add(1);
        list.add(2);
        list.add(3);

        // Добавяне на елемент на определен индекс
        list.add(1, 4);  // Списък: 1, 4, 2, 3

        // Извличане на елемент по индекс
        System.out.println("Element at index 1: " + list.get(1));  // Output: 4

        // Проверка за наличие на елемент
        System.out.println("Contains 2: " + list.contains(2));  // Output: true

        // Премахване на елемент
        list.remove(2);  // Списък: 1, 4, 3

        // Получаване на масив с елементите на списъка
        Object[] array = list.toArray();
        System.out.print("List elements: ");
        for (Object elem : array) {
            System.out.print(elem + " ");
        }
        // Output: List elements: 1 4 3
    }
}

