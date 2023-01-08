import java.util.Scanner;

public class UserLoginApp {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.addUserFromFile("users.txt");

        Scanner userInput = new Scanner(System.in);
        int numAttempts = 0;
        while (numAttempts < 5){
            System.out.println("Enter your email: ");
            String username = userInput.nextLine();
            System.out.println("Enter your password:");
            String password = userInput.nextLine();
            if (userService.validateCredentials(username, password)){
                for (User user : userService.getUsers()){
                    if (user.getUsername().equalsIgnoreCase(username)){
                        System.out.println("Welcome " + user.getName());
                    }
                }
                break;
            } else {
                numAttempts++;
                System.out.println("Invalid login, please try again");
            }
        }
        if (numAttempts == 5){
            System.out.println("Too many failed login attempts, you are now locked out.");
        }
        }
    }