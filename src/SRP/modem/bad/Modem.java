package SRP.modem.bad;

public class Modem implements IModem {

    @Override
    public void dial(String phoneNumber) {
        System.out.println("connected successfully");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected successfully");
    }

    @Override
    public void send(String str) {
        System.out.println("data sent successfully");
    }

    @Override
    public int receive() {
        System.out.println("data received successfully");
        return 0;
    }
}
