package userPojoWithIndex;

public class Main {
    public static void main(String[] args) {
        String[] stringInput = {"aUsernameHere", "aPasswordHere", "Somebodies Name"};
        User user = UserService.createUser(stringInput);
        System.out.println(user.getName());
    }
}
