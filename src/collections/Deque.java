package collections;
//  структура дек. Това е специфична структура, позволяваща елементи да бъдат добавяни и премахвани от двата й края.
//  освен това, елемент поставен от едната страна можат  да бъде премахнати  само от същата.
//  операции за премахване добавяне и изчистване на дека.
public class Deque <T> {
    private Node<T> front;  // Предната част на дека
    private Node<T> rear;   // Задната част на дека
    private int size;

    public Deque() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Метод за добавяне на елемент в предната част на дека
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

    // Метод за добавяне на елемент в задната част на дека
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

    // Метод за премахване на елемент от предната част на дека
    public T removeFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Декът е празен");
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

    // Метод за премахване на елемент от задната част на дека
    public T removeRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Декът е празен");
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

    // Метод за проверка дали декът е празен
    public boolean isEmpty() {
        return size == 0;
    }

    // Метод за изчистване на дека
    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    // Метод за получаване на текущия размер на дека
    public int size() {
        return size;
    }
}
