package robert.eftene.g1092.factory;

public abstract class AbstractUser {

    protected String username;
    protected String email;
    protected String password;

    public AbstractUser(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public abstract void login();
    public abstract void logout();
}
