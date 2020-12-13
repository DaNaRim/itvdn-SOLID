package SRP.phone.bad;

public interface IPhone {

    //connection management
    void dial(String phoneNumber);

    void disconnect();


    //data management
    void send(String massage);

    int receive();
}
