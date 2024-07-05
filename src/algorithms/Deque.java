package algorithms;

public class Deque<T>  {
    // Вътрешен клас Node, представляващ всеки елемент в дека
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Deque() {
        front = null;
        rear = null;
        size = 0;
    }

    // Добавяне на елемент в предната част на дека
    public void addFront(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    // Добавяне на елемент в задната част на дека
    public void addRear(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Премахване на елемент от предната част на дека
    public T removeFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
        size--;
        return data;
    }

    // Премахване на елемент от задната част на дека
    public T removeRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        T data = rear.data;
        rear = rear.prev;
        if (rear == null) {
            front = null;
        } else {
            rear.next = null;
        }
        size--;
        return data;
    }

    // Изчистване на дека
    public void clear() {
        front = rear = null;
        size = 0;
    }

    // Проверка дали декът е празен
    public boolean isEmpty() {
        return size == 0;
    }

    // Връща текущия размер на дека
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        // Tests
        Deque<Integer> deque = new Deque<>();
        deque.addFront(1);
        deque.addRear(2);
        deque.addFront(0);
        System.out.println(deque.removeFront()); // 0
        System.out.println(deque.removeRear());  // 2
        System.out.println(deque.removeFront()); // 1
        deque.addRear(3);
        deque.clear();
        System.out.println(deque.isEmpty()); // true
    }
}


