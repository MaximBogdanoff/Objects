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
        return String.valueOf(this.bookAge);
    }


    public boolean equals(Book other) {
        if (this.bookName != other.bookName) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
}
