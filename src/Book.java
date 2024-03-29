import java.util.Objects;

public class Book {

    private String bookName;
    private Author author;
    private int bookAge;

    public Book(String bookName, Author author, int bookAge) {
        this.bookName = bookName;
        this.author = author;
        this.bookAge = bookAge;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookAge() {
        return this.bookAge;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setBookAge(int bookAge) {
        this.bookAge = bookAge;
    }

    public String toString() {
        return String.valueOf(this.bookName+this.bookAge+this.author);
    }



    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null||getClass()!=o.getClass()) return false;

        Book that=(Book) o;
        if (bookAge!= that.bookAge) return false;
        return Objects.equals(bookName,that.bookName);
    }


    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
}
