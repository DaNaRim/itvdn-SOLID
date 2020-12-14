package SRP.modem.good;

public class ConnectionManagerImpl implements IConnectionManager {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("connected successfully");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected successfully");
    }
}
