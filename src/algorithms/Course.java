package algorithms;

import java.util.ArrayList;
import java.util.List;

// Вложени класове
public class Course {
    private String courseName; // Име на курса
    private int courseId;      // Идентификационен номер на курса
    private List<Student> students; // Списък със студенти, записани в курса

    // Конструктор за инициализиране на курса с име и идентификационен номер
    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.students = new ArrayList<>(); // Инициализация на списъка със студенти
    }

    // Метод за добавяне на студент към курса
    public void addStudent(String name, int studentId) {
        Student newStudent = new Student(name, studentId); // Създаване на нов студент
        students.add(newStudent); // Добавяне на студента в списъка със студенти
    }

    // Метод за изброяване на всички студенти в курса
    public void listStudents() {
        System.out.println("Course: " + courseName); // Отпечатване на името на курса
        for (Student student : students) {
            // Отпечатване на информация за всеки студент
            System.out.println("Student ID: " + student.studentId + ", Name: " + student.name);
        }
    }

    // Вложен (вътрешен) клас, представляващ студент
    public class Student {
        private String name;  // Име на студента
        private int studentId; // Идентификационен номер на студента

        // Конструктор за инициализиране на студента с име и идентификационен номер
        public Student(String name, int studentId) {
            this.name = name;
            this.studentId = studentId;
        }
    }

    // Главен метод за изпълнение на програмата
    public static void main(String[] args) {
        // Създаване на нов курс по "Компютърни науки"
        Course course = new Course("Computer Science", 101);

        // Добавяне на трима студенти към курса
        course.addStudent("Alice", 1);    // Добавяне на студент с име "Alice" и ID 1
        course.addStudent("Bob", 2);      // Добавяне на студент с име "Bob" и ID 2
        course.addStudent("Charlie", 3);  // Добавяне на студент с име "Charlie" и ID 3

        // Изброяване на всички студенти, записани в курса
        course.listStudents();
    }
}
