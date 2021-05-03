package robert.eftene.g1092.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserFactory {

    public static AbstractUser createUser(ERole role, String username, String email, String password) {
        switch (role) {
            case USER_GENERAL:
                List<String> likedServices = new ArrayList<>();
                likedServices.addAll(Arrays.asList("Cafe","SportArena"));
                return new GeneralUser(username,email,password,likedServices);
            case USER_ADMINISTRATOR:
                return new AdministratorUser(username,email,password);
            case USER_BUSINESSOWNER:
                return new BusinessOwner(username,email,password,"SportsArena");
            default:
                throw new UnsupportedOperationException("User role not defined");
        }
    }

}
