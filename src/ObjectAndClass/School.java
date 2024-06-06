package ObjectAndClass;

import java.util.ArrayList;
import java.util.List;
// Имаме училище. В училището имаме класове и ученици. Всеки клас има множество от преподаватели.
// Всеки преподавател има множество от дисциплини, по които преподава. Учениците имат име и уникален номер в класа. Класовете имат уникален текстов идентификатор.
// Дисциплините имат име, брой уроци и брой упражнния.
//Създаване на  училище с Java класове.

public class School {
    private String name;
    private List<SchoolClass> schoolClasses;

    public School(String name) {
        this.name = name;
        this.schoolClasses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSchoolClass(SchoolClass schoolClass) {
        this.schoolClasses.add(schoolClass);
    }

    public List<SchoolClass> getSchoolClasses() {
        return schoolClasses;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", schoolClasses=" + schoolClasses +
                '}';
    }
}

