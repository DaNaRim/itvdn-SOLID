package SRP.modem.good;

public class ModemClient {
    public static void main(String[] args) {

        Modem modem = new Modem(new ConnectionManagerImpl(), new DataManagerImpl());

        modem.dial("01234567");
        modem.send("String");
        modem.receive();
        modem.disconnect();
    }
}
