package algorithms;

// сортиране на числа в динамичен свързан списък, без допълнителен масив.
public class LinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        this.head = null;
    }

    // Добавяне на елемент в началото на списъка
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Сортиране на свързания списък чрез вмъкване
    public void insertionSort() {
        if (head == null || head.next == null) {
            return;
        }

        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;

            // Вмъкване на текущия възел в сортираната част
            sorted = sortedInsert(sorted, current);

            current = next;
        }

        head = sorted;
    }

    // Вмъкване на възел в сортираната част на списъка
    private Node sortedInsert(Node sorted, Node newNode) {
        if (sorted == null || sorted.data >= newNode.data) {
            newNode.next = sorted;
            return newNode;
        }

        Node current = sorted;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return sorted;
    }

    // Отпечатване на списъка
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(7);

        System.out.println("Before sorting:");
        list.printList();

        list.insertionSort();

        System.out.println("After sorting:");
        list.printList();
    }
}
