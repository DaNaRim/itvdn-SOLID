package SRP.phone.bad;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone phone = new Phone();

        phone.dial("0123456789");
        phone.send("text");
        phone.receive();
        phone.disconnect();
    }
}
