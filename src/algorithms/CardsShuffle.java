package algorithms;

import java.util.ArrayList;
import java.util.Random;

public class CardsShuffle {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<Card>();

        // Добавяне на карти в тестето
        cards.add(new Card("2", Suit.CLUB));
        cards.add(new Card("7", Suit.HEART));
        cards.add(new Card("A", Suit.SPADE));
        cards.add(new Card("J", Suit.CLUB));
        cards.add(new Card("10", Suit.DIAMOND));

        System.out.println("Initial deck: ");
        printCards(cards);

        // Разбъркване на картите
        shuffleCards(cards);
        System.out.println("After shuffle: ");
        printCards(cards);
    }

    // Извършва единичен обмен на карта с първата карта в тестето.
    private static void performSingleExchange(ArrayList<Card> cards) {
        Random rand = new Random();
        int randomIndex = 1 + rand.nextInt(cards.size() - 1);

        // Смяна на първата карта с произволна карта (с изключение на първата)
        Card firstCard = cards.get(0);
        Card randomCard = cards.get(randomIndex);
        cards.set(0, randomCard);
        cards.set(randomIndex, firstCard);
    }

    // Разбърква тестето от карти.

    public static void shuffleCards(ArrayList<Card> cards) {
        for (int i = 0; i < cards.size(); i++) {
            performSingleExchange(cards);
        }
    }

    //Принтира всички карти в тестето.


    public static void printCards(ArrayList<Card> cards) {
        for (Card card : cards) {
            System.out.print(card + " ");
        }
        System.out.println();
    }
}

// Примерен клас Card
class Card {
    private String value;
    private Suit suit;

    public Card(String value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return value + " of " + suit + " ";
    }
}

// Примерен енум Suit
enum Suit {
    CLUB, DIAMOND, HEART, SPADE
}

