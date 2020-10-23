public class Authenticator {
    User[] staff = FakeDb.INSTANCE.getStaff();

    public User auth(String login, String password) {
        for(int i = 0; i < staff.length; i++) {
            User currentUser = staff[i];

            if (currentUser.validate(login, password)) {
                return currentUser;
            }
        }

        return new User("not authorized", "");
    }
}
