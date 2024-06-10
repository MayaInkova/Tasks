package collections;

// динамична реализация на стек

public class DynamicStack <T> {
    private Node<T> top;  // връх на стека
    private int size;     // текущ размер на стека
    public DynamicStack() {
        this.top = null;
        this.size = 0;
    }

    // Метод за добавяне на елемент (push)
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Метод за премахване на елемент (pop)
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стекът е празен");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Метод за преглеждане на върховия елемент (peek)
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стекът е празен");
        }
        return top.data;
    }

    // Метод за проверка дали стекът е празен
    public boolean isEmpty() {
        return top == null;
    }

    // Метод за получаване на текущия размер на стека
    public int size() {
        return size;
    }
}
