package userPojoWithIndex;

import userPojoWithIndex.User;

public class UserService {
    public static User createUser(String[] stringInput){
        String username = stringInput[0];
        String password = stringInput[1];
        String name = stringInput[2];
        User user = new User(username, password, name);
        return user;
    }
}
