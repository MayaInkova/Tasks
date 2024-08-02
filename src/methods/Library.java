package methods;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Конструктор
    public Library() {
        books = new ArrayList<>();
    }

    // Добавяне на книга
    public void addBook(Book book) {
        books.add(book);
    }

    // Премахване на книга
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Списък с налични книги
    public List<Book> listAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    // Намиране на книга по заглавие
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.toString().contains(title)) {
                return book;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1949);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Available books:");
        for (Book book : library.listAvailableBooks()) {
            System.out.println(book);
        }

        book1.borrowBook();
        System.out.println("\nAfter borrowing 'The Catcher in the Rye':");
        for (Book book : library.listAvailableBooks()) {
            System.out.println(book);
        }

        book1.returnBook();
        System.out.println("\nAfter returning 'The Catcher in the Rye':");
        for (Book book : library.listAvailableBooks()) {
            System.out.println(book);
        }
    }
}

