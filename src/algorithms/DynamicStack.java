package algorithms;

//динамична реализация на стек и методи за необходимите операции.
public class DynamicStack {
    private Node top;
    private int size;

    // Вътрешен клас Node
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public DynamicStack() {
        this.top = null;
        this.size = 0;
    }

    // Проверка дали стекът е празен
    public boolean isEmpty() {
        return top == null;
    }

    // Добавяне на елемент в стека
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Премахване на елемент от стека
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int value = top.value;
        top = top.next;
        size--;
        return value;
    }

    // Връщане на горния елемент на стека без да го премахва
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.value;
    }

    // Връщане на размера на стека
    public int getSize() {
        return size;
    }

    // Метод, който връща масив с елементите на стека
    public int[] toArray() {
        int[] array = new int[size];
        Node current = top;
        int i = 0;
        while (current != null) {
            array[i] = current.value;
            current = current.next;
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println("Peek after pop: " + stack.peek()); // 20

        int[] array = stack.toArray();
        System.out.print("Stack elements: ");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}