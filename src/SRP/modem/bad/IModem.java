package SRP.modem.bad;

/* Problems =
  (1) IModem doesn't indicate clearly its responsibilities
  (2) Single IModem has two responsibilities - connection management + data management. That means, it has more than one reasons to change.
  (3) Difficult to understand and maintain as it grows.
*/

public interface IModem {

    // --- Connection management responsibilities = dial, disconnect

    void dial(String phoneNumber);

    void disconnect();

    // --- Data management responsibilities = send, receive

    void send(String str);

    int receive();
}
