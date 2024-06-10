package conditionalConstructions;

import java.util.Scanner;

//Програма, която за дадена цифра (0-9), зададена като вход, извежда името на цифрата на български език.
public class DigitToBulgarian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цифра (0-9): ");
        int digit = scanner.nextInt();

        String digitName;

        switch (digit) {
            case 0:
                digitName = "нула";
                break;
            case 1:
                digitName = "едно";
                break;
            case 2:
                digitName = "две";
                break;
            case 3:
                digitName = "три";
                break;
            case 4:
                digitName = "четири";
                break;
            case 5:
                digitName = "пет";
                break;
            case 6:
                digitName = "шест";
                break;
            case 7:
                digitName = "седем";
                break;
            case 8:
                digitName = "осем";
                break;
            case 9:
                digitName = "девет";
                break;
            default:
                digitName = "Невалидна цифра";
                break;
        }

        System.out.println("Името на цифрата е: " + digitName);
    }
}
