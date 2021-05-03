package robert.eftene.g1092.factory;

public class BusinessOwner extends AbstractUser {

    String service;

    public BusinessOwner(String username, String email, String password, String service) {
        super(username, email, password);
        this.service = service;
    }

    @Override
    public void login() {
        System.out.println("Business owner " + this.username + " successfully logged in");
        System.out.println("Your service is: " + this.service);
    }

    @Override
    public void logout() {
        System.out.println("Business owner " + this.username + " successfully logged out");
    }
}
