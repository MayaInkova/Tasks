package ObjectAndClass;

public class Studenttt {
    private String name;
    private int uniqueNumber;

    public Studenttt(String name, int uniqueNumber) {
        this.name = name;
        this.uniqueNumber = uniqueNumber;
    }

    public String getName() {
        return name;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", uniqueNumber=" + uniqueNumber +
                '}';
    }
}
