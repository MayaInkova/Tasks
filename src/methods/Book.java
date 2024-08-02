package methods;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;

    // Конструктор
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = false; // По подразбиране не е взета назаем
    }

    // Метод за вземане назаем
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
        }
    }

    // Метод за връщане на книгата
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        }
    }

    // Метод за проверка дали книгата е налична
    public boolean isAvailable() {
        return !isBorrowed;
    }

    // toString метод за текстово представяне на книгата
    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ") - " + (isBorrowed ? "Borrowed" : "Available");
    }
}

