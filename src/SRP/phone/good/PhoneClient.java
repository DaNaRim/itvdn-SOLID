package SRP.phone.good;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImpl(), new DataManagerImpl());

        phone.dial("012345678");
        phone.send("text");
        phone.receive();
        phone.disconnect();
    }
}
