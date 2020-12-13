package SRP.phone.good;

public class DataManagerImpl implements IDataManager {

    @Override
    public void send(String massage) {
        System.out.println("data sent successfully");
    }

    @Override
    public int receive() {
        System.out.println("data received successfully");
        return 0;
    }
}
