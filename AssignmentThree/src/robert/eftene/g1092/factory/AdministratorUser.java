package robert.eftene.g1092.factory;

public class AdministratorUser extends AbstractUser {

    public AdministratorUser(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Administrator " + this.username + " successfully logged in!");
    }

    @Override
    public void logout() {
        System.out.println("Administrator " + this.username + " successfully logged out!");

    }
}
