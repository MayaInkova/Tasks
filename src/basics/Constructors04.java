package basics;

//Програма, която прилага бонус точки към дадени точки в интервала [1..9] чрез прилагане на следните правила:
//
//-     Ако точките са между 1 и 3, програмата ги умножава по 10.
//
//-     Ако точките са между 4 и 6, ги умножава по 100.
//
//-     Ако точките са между 7 и 9, ги умножава по 1000.
//
//-     Ако точките са 0 или повече от 9, се отпечатва съобщение за грешка.

import java.util.Scanner;

public class Constructors04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter points: ");
        int points = scanner.nextInt();

        int bonusPoints;

        // Проверка за интервалите и прилагане на бонус точки
        if (points >= 1 && points <= 3) {
            bonusPoints = points * 10;
        } else if (points >= 4 && points <= 6) {
            bonusPoints = points * 100;
        } else if (points >= 7 && points <= 9) {
            bonusPoints = points * 1000;
        } else {
            System.out.println("Error: Points should be between 1 and 9.");
            return;
        }

        System.out.println("Bonus points: " + bonusPoints);
    }
}
