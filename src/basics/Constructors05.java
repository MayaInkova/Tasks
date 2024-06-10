package basics;

import java.util.Scanner;

// програма, която преобразува дадено число в интервала [0..999] в текст, съответстващ на българското произношение.
// Примери:
//    0 -> "Нула"
//    273 -> "Двеста седемдесет и три"
//   400 -> "Четиристотин"
//   501 -> "Петстотин и едно"
//   711 -> "Седемстотин и единадесет"


public class Constructors05 {

        static final String[] units = {
                "", "едно", "две", "три", "четири", "пет", "шест", "седем", "осем", "девет",
                "десет", "единадесет", "дванадесет", "тринадесет", "четиринадесет", "петнадесет",
                "шестнадесет", "седемнадесет", "осемнадесет", "деветнадесет"
        };

        // Масив с българските наименования на десетиците
        private static final String[] tens = {
                "", "", "двадесет", "тридесет", "четиридесет", "петдесет", "шестдесет",
                "седемдесет", "осемдесет", "деветдесет"
        };

        // Масив с българските наименования на стотиците
        private static final String[] hundreds = {
                "", "сто", "двеста", "триста", "четиристотин", "петстотин", "шестстотин",
                "седемстотин", "осемстотин", "деветстотин"
        };

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number (0-999): ");
            int number = scanner.nextInt();

            if (number < 0 || number > 999) {
                System.out.println("Invalid input! Number should be between 0 and 999.");
                return;
            }

            String result = "";

            // Преобразуване на стотиците
            if (number >= 100) {
                result += hundreds[number / 100] + " ";
                number %= 100;
            }

            // Преобразуване на десетиците и единиците
            if (number >= 20) {
                result += tens[number / 10] + " ";
                number %= 10;
            }

            if (number > 0) {
                result += units[number];
            }

            if (result.equals("")) {
                result = "нула";
            }

            System.out.println("Number in Bulgarian: " + result);
        }
    }

