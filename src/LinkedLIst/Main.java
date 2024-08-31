package LinkedLIst;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Добавяне на елементи в началото на списъка
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);

        // Отпечатване на списъка
        System.out.print("Списъкът е: ");
        list.printList();
    }
}
