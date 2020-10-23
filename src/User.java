import java.util.Scanner;

public class User {
    private String login;
    private String password;
    protected Scanner input = new Scanner(System.in);

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean validate(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }

    public void getActionList() {
        System.out.println("Authorization failed");
    }
}
