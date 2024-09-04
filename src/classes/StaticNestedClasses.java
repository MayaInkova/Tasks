package classes;


public class StaticNestedClasses {

    // Външен клас
    static class OuterClass {

        // Статичен вложен клас
        static class StaticNestedClass {
            void display() {
                System.out.println("This is a static nested class.");
            }
        }
    }

    public static class Main {
        public static void main(String[] args) {
            // Правилно създаване на обект от статичния вложен клас
            OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
            nestedObject.display();
        }
    }
}

