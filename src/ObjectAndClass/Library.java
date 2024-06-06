package ObjectAndClass;

import java.util.ArrayList;
import java.util.List;
// клас, който описва библиотека, има  методи за добавяне на книга към библиотеката,
// търсене на книга по предварително зададен автор, извеждане на информация за дадена книга и изтриване на книга от библиотекат
public class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Метод за добавяне на книга
    public void addBook(Book book) {
        books.add(book);
    }

    // Метод за търсене на книги по автор
    public List<Book> searchBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    // Метод за извеждане на информация за дадена книга
    public Book getBookInfo(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Метод за изтриване на книга от библиотеката
    public boolean removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    //  метод за печат на всички книги в библиотеката
    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        // Създаване на библиотека и добавяне на книги
        Library library = new Library("City Library");

        Book book1 = new Book("Book Title 1", "Author 1", "Publisher 1", 2001, "ISBN001");
        Book book2 = new Book("Book Title 2", "Author 2", "Publisher 2", 2002, "ISBN002");
        Book book3 = new Book("Book Title 3", "Author 1", "Publisher 3", 2003, "ISBN003");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Печат на всички книги в библиотеката
        library.printAllBooks();

        // Търсене на книги по автор
        System.out.println("\nBooks by Author 1:");
        List<Book> booksByAuthor1 = library.searchBooksByAuthor("Author 1");
        for (Book book : booksByAuthor1) {
            System.out.println(book);
        }

        // Извеждане на информация за книга по ISBN
        System.out.println("\nInformation about book with ISBN 'ISBN002':");
        Book bookInfo = library.getBookInfo("ISBN002");
        System.out.println(bookInfo);

        // Изтриване на книга от библиотеката по ISBN
        boolean isRemoved = library.removeBook("ISBN003");
        System.out.println("\nBook with ISBN 'ISBN003' removed: " + isRemoved);

        // Печат на всички книги в библиотеката след изтриването
        System.out.println("\nAll books in the library after removal:");
        library.printAllBooks();
    }
}
