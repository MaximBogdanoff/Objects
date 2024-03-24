public class Main {
    public static void main(String[] args) {

        Author bookOne = new Author("Федор", "Достоевский");
        Author bookTwo = new Author("Даниель", "Дефо");
        Book one = new Book("Преступление и наказание", bookOne, 1866);
        Book two = new Book("Робинзон Крузо", bookTwo, 1719);
        System.out.println("Название книги " + one.getBookName() + ". Автор " + one.getAuthor() + " , год выхода " + one.getBookAge());
        System.out.println("Название книги " + two.getBookName() + ". Автор " + two.getAuthor() + " , год выхода " + two.getBookAge());
    }
}

