package ObjectAndClass;

import java.util.List;
// тестов клас, който създава обект от тип библиотека, добавя няколко книги към него и извежда информация за всяка една от тях. Имплементирай тестова функционалност,
// която намира всички книги, чийто автор е Стивън Кинг и ги изтрива. Накрая, отново извежда  информация за всяка една от оставащите книги.
public class LibraryTest {
    public static void main(String[] args) {
        // Създаване на обект от тип библиотека
        Library library = new Library("City Library");

        // Добавяне на няколко книги към библиотеката
        library.addBook(new Book("The Shining", "Stephen King", "Doubleday", 1977, "ISBN001"));
        library.addBook(new Book("It", "Stephen King", "Viking", 1986, "ISBN002"));
        library.addBook(new Book("Misery", "Stephen King", "Viking", 1987, "ISBN003"));
        library.addBook(new Book("1984", "George Orwell", "Secker & Warburg", 1949, "ISBN004"));
        library.addBook(new Book("Brave New World", "Aldous Huxley", "Chatto & Windus", 1932, "ISBN005"));

        // Извеждане на информация за всяка книга в библиотеката
        System.out.println("All books in the library:");
        library.printAllBooks();

        // Намиране на всички книги на Стивън Кинг и тяхното изтриване
        List<Book> booksByStephenKing = library.searchBooksByAuthor("Stephen King");
        for (Book book : booksByStephenKing) {
            library.removeBook(book.getIsbn());
        }

        // Извеждане на информация за оставащите книги
        System.out.println("\nAll books in the library after removing Stephen King's books:");
        library.printAllBooks();
    }
}
