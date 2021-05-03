package robert.eftene.g1092.factory;

import java.util.ArrayList;
import java.util.List;

public class GeneralUser extends AbstractUser {

    List<String> likedBusinesses = new ArrayList<>();

    public GeneralUser(String username, String email, String password, List<String> likedBusinesses) {
        super(username, email, password);
        this.likedBusinesses = likedBusinesses;
    }

    @Override
    public void login() {
        System.out.println("User " + this.username + " successfully logged in");
        System.out.println("Your liked services are: " + this.likedBusinesses.toString());
    }

    @Override
    public void logout() {
        System.out.println("User " + this.username + " successfully logged in");
    }
}
