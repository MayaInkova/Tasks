package algorithms;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> digits = new ArrayDeque<>();
        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            if (Character.isDigit(input[i].charAt(0))) {
                // Ако текущият вход е цифра, я добавяме в стека
                digits.push(Integer.parseInt(input[i]));
            } else if (input[i].charAt(0) == '+') {
                // Ако текущият вход е '+', извършваме събиране
                Integer left = digits.pop();  // Вземаме най-горния елемент от стека
                Integer right = Integer.parseInt(input[i + 1]);  // Вземаме следващото число от входа
                Integer result = left + right;  // Сумираме двете числа
                digits.push(result);  // Добавяме резултата в стека
                i++;  // Прескачаме следващия елемент, тъй като вече сме го използвали
            } else if (input[i].charAt(0) == '-') {
                // Ако текущият вход е '-', извършваме изваждане
                Integer left = digits.pop();  // Вземаме най-горния елемент от стека
                Integer right = Integer.parseInt(input[i + 1]);  // Вземаме следващото число от входа
                Integer result = left - right;  // Изваждаме двете числа
                digits.push(result);  // Добавяме резултата в стека
                i++;  // Прескачаме следващия елемент, тъй като вече сме го използвали
            }
        }

        // Отпечатваме резултата, който е на върха на стека
        System.out.println(digits.peek());
    }
}





