package LinkedLIst;

public class LinkedList {
    Node head;

    // Метод за добавяне на елемент в началото на списъка
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Метод за отпечатване на списъка
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
