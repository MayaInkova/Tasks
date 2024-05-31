package ConditionalConstructions;
//Програма, която преобразува дадено число в интервала [0..999] в текст, съответстващ на българското произношение. Примери:
//0  "Нула"
//273  "Двеста седемдесет и три"
// 400  "Четиристотин"

import java.util.Scanner;

public class NumberToTextBG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете число (0-999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Грешка: Невалидно число");
            return;
        }

        System.out.println(numberToText(number));
    }

    public static String numberToText(int number) {
        if (number == 0) {
            return "Нула";
        }

        String[] units = { "", "едно", "две", "три", "четири", "пет", "шест", "седем", "осем", "девет",
                "единадесет", "дванадесет", "тринадесет", "четиринадесет", "петнадесет", "шестнадесет",
                "седемнадесет", "осемнадесет", "деветнадесет" };
        String[] tens = { "", "десет", "двадесет", "тридесет", "четиридесет", "петдесет",
                "шестдесет", "седемдесет", "осемдесет", "деветдесет" };
        String[] hundreds = { "", "сто", "двеста", "триста", "четиристотин", "петстотин",
                "шестстотин", "седемстотин", "осемстотин", "деветстотин" };

        StringBuilder result = new StringBuilder();

        if (number >= 100) {
            result.append(hundreds[number / 100]);
            number %= 100;
            if (number > 0) {
                result.append(" ");
            }
        }

        if (number >= 20) {
            result.append(tens[number / 10]);
            number %= 10;
            if (number > 0) {
                result.append(" ");
                result.append(units[number]);
            }
        } else if (number > 0) {
            result.append(units[number]);
        }

        return result.toString().trim();
    }
}
