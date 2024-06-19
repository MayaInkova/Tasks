package algorithms;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        String input = scanner.nextLine();

        while (!input.equals("Home")) {
            boolean error = false;
            if (input.equals("back")) {
                // Ако в историята няма поне две URL адреса, не можем да се върнем назад
                if (history.size() < 2) {
                    System.out.println("no previous URLs");
                    error = true;
                } else {
                    // Премахваме текущия URL и показваме предишния
                    history.pop();
                }
            } else {
                // Добавяме новия URL в историята
                history.push(input);
            }

            // Ако няма грешка, отпечатваме текущия URL
            if (!error) {
                System.out.println(history.peek());
            }

            // Четем следващия вход от потребителя
            input = scanner.nextLine();
        }
    }
}