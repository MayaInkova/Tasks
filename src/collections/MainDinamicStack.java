package collections;

public class MainDinamicStack {
    public static void main(String[] args) {
        DynamicStack<Integer> stack = new DynamicStack<>();

        // Добавяне на елементи в стека
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Преглеждане на върховия елемент
        System.out.println("Върховият елемент е: " + stack.peek());  // Output: 3

        // Премахване на елементи от стека
        System.out.println("Изваден елемент: " + stack.pop());  // Output: 3
        System.out.println("Изваден елемент: " + stack.pop());  // Output: 2

        // Проверка на текущия размер на стека
        System.out.println("Размер на стека: " + stack.size());  // Output: 1

        // Проверка дали стекът е празен
        System.out.println("Стекът е празен: " + stack.isEmpty());  // Output: false

        // Премахване на последния елемент
        stack.pop();

        // Проверка дали стекът е празен
        System.out.println("Стекът е празен: " + stack.isEmpty());  // Output: true
    }
}
