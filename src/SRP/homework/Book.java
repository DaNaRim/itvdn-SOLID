package SRP.homework;

public class Book {

    private final BookReader bookReader = new BookReader();

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

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

    public void turnPage() {
        bookReader.turnPage();
    }

    public int getCurrentPage() {
        return bookReader.getCurrentPage();
    }
}
