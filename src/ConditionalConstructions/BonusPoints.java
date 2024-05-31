package ConditionalConstructions;

import java.util.Scanner;

//Програма, която прилага бонус точки към дадени точки в интервала [1..9] чрез прилагане на следните правила:
//Ако точките са между 1 и 3, програмата ги умножава по 10.
//Ако точките са между 4 и 6, ги умножава по 100.
//Ако точките са между 7 и 9, ги умножава по 1000.
// Ако точките са 0 или повече от 9, се отпечатва съобщение за грешка.
public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете точки (1-9): ");
        int points = scanner.nextInt();

        int bonusPoints;

        if (points >= 1 && points <= 3) {
            bonusPoints = points * 10;
        } else if (points >= 4 && points <= 6) {
            bonusPoints = points * 100;
        } else if (points >= 7 && points <= 9) {
            bonusPoints = points * 1000;
        } else {
            System.out.println("Грешка: Невалиден брой точки");
            return; // Излизаме от програмата, ако точките са извън валидния интервал
        }

        System.out.println("Бонус точки: " + bonusPoints);
    }
}
