package basics;

import java.util.Scanner;
// принтираме два масива и принтираме тези, които съвпадат

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String [] firstArr = scanner.nextLine().split(" ");
        String [] secondArr = scanner.nextLine().split(" ");

        for (String secondElement : secondArr) {
            for (String firstElement : firstArr) {
                if (secondElement.equals(firstElement)) {
                    System.out.println(firstElement + " ");
                }
            }

        }
    }
}
