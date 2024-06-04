package ObjectAndClass;

public class Student {
    private String fullName;
    private int course;
    private String specialty;
    private String university;
    private String email;
    private String phoneNumber;
    private static int studentCount = 0; // Статично поле за броя на създадените обекти

    // Конструктор с всички параметри
    public Student(String fullName, int course, String specialty, String university, String email, String phoneNumber) {
        this.fullName = fullName;
        this.course = course;
        this.specialty = specialty;
        this.university = university;
        this.email = email;
        this.phoneNumber = phoneNumber;
        studentCount++; // Увеличаваме броя на създадените обекти
    }

    // Конструктор с частични параметри: пълно име, курс, специалност
    public Student(String fullName, int course, String specialty) {
        this(fullName, course, specialty, null, null, null);
    }

    // Конструктор с параметри: пълно име, курс
    public Student(String fullName, int course) {
        this(fullName, course, null, null, null, null);
    }

    // Конструктор с параметри: пълно име
    public Student(String fullName) {
        this(fullName, 0, null, null, null, null);
    }

    // Конструктор без параметри
    public Student() {
        this(null, 0, null, null, null, null);
    }

    // Гетъри и сетъри
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    // Метод toString за представяне на информацията за студента
    @Override
    public String toString() {
        return String.format("Student [Full Name: %s, Course: %d, Specialty: %s, University: %s, Email: %s, Phone Number: %s]",
                fullName, course, specialty, university, email, phoneNumber);
    }

    // Метод за извеждане на пълна информация за студента
    public void printStudentInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Course: " + course);
        System.out.println("Specialty: " + specialty);
        System.out.println("University: " + university);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }
}



