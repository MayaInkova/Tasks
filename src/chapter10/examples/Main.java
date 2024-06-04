package chapter10.examples;

import chapter10.Cat;
import chapter10.Sequence;

    public class Main {
        public static void main(String[] args) {
            // Създаване и използване на обект от клас Cat
            Cat myCat = new Cat("Whiskers");
            myCat.meow();

            // Създаване и използване на обект от клас Sequence
            Sequence sequence = new Sequence();
            System.out.println("Next number in sequence: " + sequence.next());
            System.out.println("Next number in sequence: " + sequence.next());
            System.out.println("Next number in sequence: " + sequence.next());
        }
}
