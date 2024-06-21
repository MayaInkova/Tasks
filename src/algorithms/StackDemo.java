package algorithms;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        // // Създаване на стек от тип String
        Stack<String> stack = new Stack<String>();

       // Добавяне на елементи в стека
        stack.push("1. Ivan");
        stack.push("2. Nikolay");
        stack.push("3. Maria");
        stack.push("4. George");

        System.out.println("Top = " + stack.peek());


      // Изваждане и отпечатване на всички елементи от стека
        while (!stack.isEmpty()) {
            String personName = stack.pop();
            System.out.println(personName);
        }
    }
}
