package chapter10;

public class Sequence {
    private int current;

    public Sequence() {
        this.current = 0;
    }

    public int next() {
        return current++;
    }
}
