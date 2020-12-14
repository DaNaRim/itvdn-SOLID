package SRP.homework;

public class Demo {

    public static void main(String[] args) {

        Book book = new Book("title", "author");

        System.out.println(book.getCurrentPage());
        book.turnPage();
        book.turnPage();
        System.out.println(book.getCurrentPage());


        Book book2 = new Book("title", "author");

        System.out.println(book2.getCurrentPage());
        book2.turnPage();
        book2.turnPage();
        System.out.println(book2.getCurrentPage());
    }
}
