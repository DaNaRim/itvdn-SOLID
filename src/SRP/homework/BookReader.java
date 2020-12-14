package SRP.homework;

public class BookReader {

    private int currentPage = 0;

    public void turnPage() {
        currentPage++;
    }

    public int getCurrentPage() {
        return currentPage;
    }
}
