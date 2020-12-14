package SRP.modem.good;

public class DataManagerImpl implements IDataManager {

    @Override
    public void send(String str) {
        System.out.println("sent data");
    }

    @Override
    public int receive() {
        System.out.println("received data");
        return 0;
    }
}
