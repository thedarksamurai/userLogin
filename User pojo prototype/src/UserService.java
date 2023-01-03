import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users;

    public UserService(){
        users = new ArrayList<>();
    }
    public void addUser(User user){
        users.add(user);
    }
    public User findUserByUserName(String username){
        for (User user : users){
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }
}
