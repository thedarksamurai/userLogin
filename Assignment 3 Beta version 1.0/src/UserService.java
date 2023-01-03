import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class UserService {
    private final ArrayList<User> users;

    public ArrayList<User> getUsers() {
        return users;
    }

    public UserService(){
        this.users = new ArrayList<>();
    }
    public void addUserFromFile(String filePath){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] userData = line.split(",");
                String username = userData[0];
                String password = userData[1];
                String name = userData[2];
                User user = new User(username, password, name);
                users.add(user);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public boolean validateCredentials(String username, String password){
        for (User user : users){
            if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
