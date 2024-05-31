package Loops;
//Програма, която отпечатва всички възможни карти от стандартно тесте без джокери (имаме 52 карти: 4 бои по 13 карти).
public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = { "Спатия", "Каро", "Купа", "Пика" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Вале", "Дама", "Поп", "Асо" };

        for (String suit : suits) {
            for (String rank : ranks) {
                System.out.println(rank + " " + suit);
            }
        }
    }
}
