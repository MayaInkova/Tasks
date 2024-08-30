package algorithms;

import java.util.LinkedList;

public class PalindromeChecker {

    //Дадена е дума. Необходимо е да се провери дали думата е палиндром, като използваме LinkedList.
    // Думата е палиндром, ако се чете еднакво отляво надясно и отдясно наляво.
    // Метод за проверка дали дадена дума е палиндром


    public static boolean isPalindrome(String str) {
        // Създаваме LinkedList за съхранение на символите от думата
        LinkedList<Integer> list = new LinkedList();

        // Обхождаме думата и добавяме всеки символ в края на списъка
        for (char ch : str.toCharArray()) {
            list.addLast((int) ch);
        }

        // Проверяваме дали думата е палиндром, сравнявайки символите от началото и края на списъка
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                return false;  // Ако символите не съвпадат, думата не е палиндром
            }
        }

        return true;  // Ако всички символи съвпадат, думата е палиндром
    }

    // Тест на метода
    public static void main(String[] args) {
        String str1 = "radar";
        String str2 = "hello";

        System.out.println(str1 + " е палиндром: " + isPalindrome(str1));  // Очаква се true
        System.out.println(str2 + " е палиндром: " + isPalindrome(str2));  // Очаква се false
    }
}
