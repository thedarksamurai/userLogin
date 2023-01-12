import java.util.Scanner;

public class UserLoginApp {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.addUserFromFile("userdata.txt");

        Scanner userInput = new Scanner(System.in);
        int numAttempts = 0;
        //boolean invalidUser = false;
        while (numAttempts < 5) {
            System.out.println("Enter your email: ");
            String username = userInput.nextLine();
            System.out.println("Enter your password:");
            String password = userInput.nextLine();
            if (userService.validateCredentials(username, password)) {
                for (User user : userService.getUsers()) {
                    if (user.getUsername().equalsIgnoreCase(username)) {
                        System.out.println("Welcome " + user.getName());
                    }
                }
                break;
            } else  {
                numAttempts++;
                if (numAttempts == 5) {
                    System.out.println("To many unsuccessful login attempts, you have been locked out.");
                } else {
                    System.out.println("Invalid login, please try again");
                }
            }

        }
        }
    }