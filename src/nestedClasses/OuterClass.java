package nestedClasses;

public class OuterClass {
    // Статичен вложен клас
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside Static Nested Class");
        }
    }

    // Вътрешен клас
    class InnerClass {
        void display() {
            System.out.println("Inside Inner Class");
        }
    }

    void demonstrateLocalInnerClass() {
        // Локален вътрешен клас
        class LocalInnerClass {
            void display() {
                System.out.println("Inside Local Inner Class");
            }
        }
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }

    void demonstrateAnonymousInnerClass() {
        // Анонимен вътрешен клас
        Runnable anonymousInner = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Anonymous Inner Class");
            }
        };
        anonymousInner.run();
    }

    public static void main(String[] args) {
        // Работа със статичен вложен клас
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        // Работа с вътрешен клас
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        // Работа с локален вътрешен клас
        outer.demonstrateLocalInnerClass();

        // Работа с анонимен вътрешен клас
        outer.demonstrateAnonymousInnerClass();
    }
}

