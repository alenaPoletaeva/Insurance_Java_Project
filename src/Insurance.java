import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        String login;
        String password;
        Scanner input = new Scanner(System.in);
        Authenticator authenticator = new Authenticator();

        System.out.println("Enter username:");
        login = input.nextLine();

        System.out.println("Enter password:");
        password = input.nextLine();

        User user = authenticator.auth(login, password);

        user.getActionList();
    }
}
