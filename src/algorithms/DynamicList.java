package algorithms;

public class DynamicList {
    // Клас за представяне на възел в свързан списък
    private class Node {
        Object element; // Елементът, съхраняван в този възел
        Node next; // Указател към следващия възел

        // Конструктор, който създава възел и го свързва към предишния възел
        Node(Object element, Node prevNode) {
            this.element = element;
            prevNode.next = this;
        }

        // Конструктор, който създава възел без връзка към предишен възел
        Node(Object element) {
            this.element = element;
            this.next = null;
        }
    }

    private Node head; // Първият възел в списъка
    private Node tail; // Последният възел в списъка
    private int count; // Броят на елементите в списъка

    // Конструктор за инициализация на празен списък
    public DynamicList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    // Метод за добавяне на нов елемент в края на списъка
    public void add(Object item) {
        if (head == null) {
            // Ако списъкът е празен, създаваме нов възел, който става head и tail
            head = new Node(item);
            tail = head;
        } else {
            // Ако списъкът не е празен, добавяме нов възел след tail и го правим новия tail
            Node newNode = new Node(item, tail);
            tail = newNode;
        }
        count++; // Увеличаваме броя на елементите
    }

    // Метод за премахване на елемент на даден индекс
    public Object remove(int index) {
        if (index >= count || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        int currentIndex = 0;
        Node currentNode = head;
        Node prevNode = null;
        while (currentIndex < index) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }

        count--; // Намаляваме броя на елементите
        if (count == 0) {
            head = null;
            tail = null;
        } else if (prevNode == null) {
            head = currentNode.next;
        } else {
            prevNode.next = currentNode.next;
        }
        return currentNode.element; // Връщаме премахнатия елемент
    }

    // Метод за премахване на първото срещнато съвпадение на даден елемент
    public int remove(Object item) {
        int currentIndex = 0;
        Node currentNode = head;
        Node prevNode = null;
        while (currentNode != null) {
            if ((currentNode.element != null && currentNode.element.equals(item)) ||
                    (currentNode.element == null && item == null)) {
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode != null) {
            count--; // Намаляваме броя на елементите
            if (count == 0) {
                head = null;
                tail = null;
            } else if (prevNode == null) {
                head = currentNode.next;
            } else {
                prevNode.next = currentNode.next;
            }
            return currentIndex; // Връщаме индекса на премахнатия елемент
        } else {
            return -1; // Елементът не е намерен
        }
    }

    // Метод за връщане на индекса на първото съвпадение на даден елемент
    public int indexOf(Object item) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if ((current.element != null && current.element.equals(item)) ||
                    (current.element == null && item == null)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Елементът не е намерен
    }

    // Метод за проверка дали даден елемент съществува в списъка
    public boolean contains(Object item) {
        int index = indexOf(item);
        return index != -1; // Връща true ако елементът е намерен, иначе false
    }

    // Метод за връщане на елемента на даден индекс
    public Object elementAt(int index) {
        if (index >= count || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Node currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.element; // Връща елемента на дадения индекс
    }

    // Метод за връщане на броя на елементите в списъка
    public int getLength() {
        return count;
    }

    // Главен метод за демонстрация на функционалността на класа
    public static void main(String[] args) {
        DynamicList shoppingList = new DynamicList();
        shoppingList.add("Milk");
        shoppingList.add("Honey");
        shoppingList.add("Olives");
        shoppingList.add("Beer");
        shoppingList.remove("Olives");
        System.out.println("We need to buy:");
        for (int i = 0; i < shoppingList.getLength(); i++) {
            System.out.println(shoppingList.elementAt(i));
        }
        System.out.println("Do we have to buy Bread? " + shoppingList.contains("Bread"));
    }
}

