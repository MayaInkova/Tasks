package ObjectAndClass;

public class Discipline {
    private String name;
    private int numberOfLectures;
    private int numberOfExercises;

    public Discipline(String name, int numberOfLectures, int numberOfExercises) {
        this.name = name;
        this.numberOfLectures = numberOfLectures;
        this.numberOfExercises = numberOfExercises;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLectures() {
        return numberOfLectures;
    }

    public int getNumberOfExercises() {
        return numberOfExercises;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "name='" + name + '\'' +
                ", numberOfLectures=" + numberOfLectures +
                ", numberOfExercises=" + numberOfExercises +
                '}';
    }
}

