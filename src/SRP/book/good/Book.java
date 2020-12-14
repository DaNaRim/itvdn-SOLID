package SRP.book.good;

public class Book {
    //composition
    private final BookPersistence bookPersistence;

    private String title;
    private String authorName;
    private int year;
    private String publisher;
    private double cost;

    public Book(String title, String authorName, int year, String publisher, double cost) {
        //instantiating
        this.bookPersistence = new BookPersistence();
        this.title = title;
        this.authorName = authorName;
        this.year = year;
        this.publisher = publisher;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", cost=" + cost +
                '}';
    }
}

