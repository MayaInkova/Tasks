package nestedClasses;

import java.util.ArrayList;
import java.util.List;

//програма, която моделира университет и неговите студенти.
// Университетът ще има вложен клас за студентите. Всеки студент ще има име, специалност и година на обучение.
public class University {
    private List<Student> students;

    public University() {
        students = new ArrayList<>();
    }
    //методи за добавяне на студент
    public void addStudent(String name, String major, int year) {
        students.add(new Student(name, major, year));
    }
    //премахване на студент
    public void removeStudent(String name) {
        students.removeIf(student -> student.getName().equals(name));
    }
   //изброяване на всички студенти
    public void listStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Вътрешен клас Student
    public class Student {
        private String name;
        private String major;
        private int year;

        public Student(String name, String major, int year) {
            this.name = name;
            this.major = major;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public String getMajor() {
            return major;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', major='" + major + "', year=" + year + "}";
        }
    }

    public static void main(String[] args) {
        University university = new University();
        university.addStudent("Ivan Ivanov", "Computer Science", 2);
        university.addStudent("Maria Petrova", "Mathematics", 1);

        System.out.println("List of students:");
        university.listStudents();

        university.removeStudent("Ivan Ivanov");

        System.out.println("List of students after removal:");
        university.listStudents();
    }
}
