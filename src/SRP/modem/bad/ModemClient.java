package SRP.modem.bad;

public class ModemClient {

    public static void main(String[] args) {

        IModem slowModem = new Modem();

        slowModem.dial("012345678");
        slowModem.send("string");
        slowModem.receive();
        slowModem.disconnect();
    }
}
