package collections;

public class MainDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();

        // Добавяне на елементи в предната част на дека
        deque.addFront(1);
        deque.addFront(2);
        deque.addFront(3);  // Дек: 3, 2, 1

        // Добавяне на елементи в задната част на дека
        deque.addRear(4);
        deque.addRear(5);
        deque.addRear(6);   // Дек: 3, 2, 1, 4, 5, 6

        // Премахване на елементи от предната част на дека
        System.out.println("Премахнат елемент от предната част: " + deque.removeFront());  // Output: 3

        // Премахване на елементи от задната част на дека
        System.out.println("Премахнат елемент от задната част: " + deque.removeRear());   // Output: 6

        // Проверка на текущия размер на дека
        System.out.println("Размер на дека: " + deque.size());  // Output: 4

        // Изчистване на дека
        deque.clear();
        System.out.println("Размер на дека след изчистване: " + deque.size());  // Output: 0

        // Проверка дали декът е празен
        System.out.println("Декът е празен: " + deque.isEmpty());  // Output: true
    }
}
