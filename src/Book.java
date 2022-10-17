import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int year;


    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга: " + this.title +", Автор: " + this.author +", Год: " + this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && title.equals(book.title) && author.equals(book.author);
    }

        public int hashCode(Book book) {
        return Objects.hash(title, author, year);
    }
}