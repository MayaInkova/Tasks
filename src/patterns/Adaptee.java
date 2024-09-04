package patterns;

//Adapter (Адаптер):
// Позволява на интерфейси с несъвместими типове да работят заедно, като обвива един интерфейс в друг.

interface Target {
    void request();
}
public class Adaptee {
    void specificRequest() {
        System.out.println("Specific request.");
    }
}

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
