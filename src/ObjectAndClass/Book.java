package ObjectAndClass;
//библиотека с книги, класове съответно за библиотека и книга. Библиотеката съдържа име и списък от книги.
// Книгите съдържат информация за заглавие, автор, издателство, година на издаване и ISBN-номер.
public class Book {
        private String title;
        private String author;
        private String publisher;
        private int year;
        private String isbn;

        public Book(String title, String author, String publisher, int year, String isbn) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.year = year;
            this.isbn = isbn;
        }

        // Getter-и и Setter-и за всички полета
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", year=" + year +
                    ", isbn='" + isbn + '\'' +
                    '}';
        }
    }

