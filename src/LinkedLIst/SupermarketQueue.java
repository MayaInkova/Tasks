package LinkedLIst;

import java.util.LinkedList;
import java.util.Scanner;

public class SupermarketQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>(); // Създаване на LinkedList за опашка
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("\nИзбери опция:");
            System.out.println("1. Добави клиент в опашката");
            System.out.println("2. Обслужи клиент (премахване от опашката)");
            System.out.println("3. Покажи кой е следващият клиент");
            System.out.println("4. Покажи всички клиенти в опашката");
            System.out.println("5. Проверка дали опашката е празна");
            System.out.println("6. Изход");

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Въведи име на клиента: ");
                    String customer = scanner.nextLine();
                    queue.addLast(customer); // Добавяне на клиент в края на опашката
                    System.out.println("Клиентът е добавен в опашката.");
                    break;

                case "2":
                    if (!queue.isEmpty()) {
                        String servedCustomer = queue.removeFirst(); // Премахване на първия клиент
                        System.out.println("Обслужен е клиент: " + servedCustomer);
                    } else {
                        System.out.println("Опашката е празна.");
                    }
                    break;

                case "3":
                    if (!queue.isEmpty()) {
                        System.out.println("Следващият клиент е: " + queue.getFirst());
                    } else {
                        System.out.println("Няма клиенти в опашката.");
                    }
                    break;

                case "4":
                    if (!queue.isEmpty()) {
                        System.out.println("Клиенти в опашката: " + queue);
                    } else {
                        System.out.println("Опашката е празна.");
                    }
                    break;

                case "5":
                    if (queue.isEmpty()) {
                        System.out.println("Опашката е празна.");
                    } else {
                        System.out.println("Опашката не е празна.");
                    }
                    break;

                case "6":
                    System.out.println("Излизане от програмата.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Невалидна опция. Моля, опитайте отново.");
            }
        }
    }
}

