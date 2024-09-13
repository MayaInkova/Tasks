package algorithms;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    // Дефиниране на клас Person, който имплементира интерфейса Comparable<Person>
    static class Person implements Comparable<Person> {

        // Полета за съхранение на името и приоритета на лицето
        String name;
        int priority;

        // Конструктор за инициализация на полетата name и priority
        public Person(Name name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        // Имплементация на метода compareTo от интерфейса Comparable
        @Override
        public int compareTo(Person p) {
            // Сравняваме приоритетите
            if (this.priority > p.priority) {
                return 1; // Връщаме 1, ако текущият обект има по-висок приоритет
            } else if (this.priority < p.priority) {
                return -1; // Връщаме -1, ако текущият обект има по-нисък приоритет
            } else {
                return 0; // Връщаме 0, ако приоритетите са равни
            }
        }

        // Презаписване на метода toString за представяне на обекта като стринг
        @Override
        public String toString() {
            return "[" + name + " : " + priority + "]"; // Форматирането на стринга
        }
    }

    public static void main(String[] args) {
        // Създаваме приоритетна опашка за обекти от тип Person
        PriorityQueue<Person> queue = new PriorityQueue<Person>();

        // Добавяме няколко обекта от тип Person в опашката
        queue.add(new Person("Maria", 8));
        queue.add(new Person("Peter", 5));
        queue.add(new Person("George", 3));

        // Докато опашката не е празна, извличаме и отпечатваме елементите й
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // poll() извлича и премахва елемента с най-нисък приоритет
        }

        // Очакваният изход е сортиран по приоритет във възходящ ред:
        // [George : 3]
        // [Peter : 5]
        // [Maria : 8]
    }
}
