public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        userService.addUser(new User("johnSmith","password1029","John Smith"));
        User user = userService.findUserByUserName("johnSmith");
        System.out.println(user.getUsername());
    }
}