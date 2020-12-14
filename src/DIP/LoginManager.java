package DIP;

public class LoginManager {

    //high level class

    Authenticator authenticator;

    public LoginManager(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public void login(User user) {
        authenticator.authenticate(user);
    }
}
