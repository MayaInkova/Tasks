package ObjectAndClass;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private String uniqueIdentifier;
    private List<Teacher> teachers;
    private List<Student> students;

    public SchoolClass(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "uniqueIdentifier='" + uniqueIdentifier + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
                '}';
    }
}
