package SRP.phone.good;

public class Phone implements IConnectionManager, IDataManager {

    private final IConnectionManager connection;
    private final IDataManager dataChanel;

    public Phone(IConnectionManager connection, IDataManager dataChanel) {
        this.connection = connection;
        this.dataChanel = dataChanel;
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
    public void send(String massage) {
        dataChanel.send(massage);
    }

    @Override
    public int receive() {
        return dataChanel.receive();
    }
}
