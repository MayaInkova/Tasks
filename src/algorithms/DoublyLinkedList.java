package algorithms;

// двойно свързан динамичен списък – списък, чиито елементи имат указател,
// както към следващия така и към предхождащия го елемент. Операциите добавяне,
// премахване и търсене на елемент, добавяне на елемент на определено място (индекс),
// извличане на елемент по индекс и метод, който връща масив с елементите на списъка.

class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Добавяне на елемент в края на списъка
    public void append(int value) {
        Node newNode = new Node(value);
        if (tail == null) { // Празен списък
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Премахване на елемент
    public boolean remove(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else { // Премахваме head
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else { // Премахваме tail
                    tail = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Търсене на елемент
    public Node find(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Добавяне на елемент на определено място
    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node newNode = new Node(value);
        if (index == 0) {
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        } else if (index == size) {
            append(value);
            return;
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node previous = current.prev;
            previous.next = newNode;
            newNode.prev = previous;
            newNode.next = current;
            current.prev = newNode;
        }
        size++;
    }

    // Извличане на елемент по индекс
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    // Метод, който връща масив с елементите на списъка
    public int[] toArray() {
        int[] array = new int[size];
        Node current = head;
        int i = 0;
        while (current != null) {
            array[i] = current.value;
            current = current.next;
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.insert(1, 15);
        list.remove(20);
        Node found = list.find(15);
        int value = list.get(1);
        int[] array = list.toArray();

        System.out.println("Found node value: " + (found != null ? found.value : "not found"));
        System.out.println("Value at index 1: " + value);
        System.out.print("List elements: ");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}
