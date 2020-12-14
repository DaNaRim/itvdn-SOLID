package SRP.modem.good;

public class Modem implements IConnectionManager, IDataManager {

    private final IConnectionManager connection;
    private final IDataManager dataChannel;

    public Modem(IConnectionManager connection, IDataManager dataChannel) {
        this.connection = connection;
        this.dataChannel = dataChannel;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connection.disconnect();
    }

    @Override
    public void send(String str) {
        dataChannel.send(str);
    }

    @Override
    public int receive() {
        return dataChannel.receive();
    }
}
