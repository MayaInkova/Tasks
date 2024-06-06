package ObjectAndClass;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Discipline> disciplines;

    public Teacher(String name) {
        this.name = name;
        this.disciplines = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDiscipline(Discipline discipline) {
        this.disciplines.add(discipline);
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", disciplines=" + disciplines +
                '}';
    }
}
