package patterns;

//Singleton (Единичен екземпляр): Гарантира,
// че от даден клас може да има само един екземпляр, и предоставя глобална точка за достъп до този екземпляр.

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Приватен конструктор за предотвратяване на инстанцирането.
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
