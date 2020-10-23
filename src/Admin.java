import java.util.InputMismatchException;

public class Admin extends User {

    public Admin(String login, String password) {
        super(login, password);
    }

    public void getActionList() {
        System.out.println("1. Create Client");
        System.out.println("2. Search Client");
        System.out.println("3. Create appointment");

        try {
            String point = input.nextLine();

            this.executeAction(Integer.parseInt(point));
        } catch (InputMismatchException error) {
            System.out.println("Please enter only numbers!");
        }
    }

    private void executeAction(int point) {
        switch(point) {
            case 1:
                this.createClient();
                break;
            case 2:
                this.searchClient();
                break;
            case 3:
                this.createAppointment();
                break;
            default:
                int newPoint = input.nextInt();

                this.executeAction(newPoint);
        }
    }

    private void createClient() {
        System.out.println("Enter your first name:");
        String firstName = input.nextLine();

        System.out.println("Enter your second name:");
        String secondName = input.nextLine();

        System.out.println("Enter your last name:");
        String lastName = input.nextLine();

        System.out.println("Enter your date of Birth:");
        String dateOfBirth = input.nextLine();

        System.out.println("Enter your gender:");
        String gender = input.nextLine();

        System.out.println("Enter your email:");
        String email = input.nextLine();

        System.out.println("Enter your address:");
        String address = input.nextLine();

        Client client = new Client(firstName, secondName, lastName, dateOfBirth, gender, email, address);

        FakeDb.INSTANCE.addClient(client);

        System.out.println("Client has been successfully created!");
        this.getActionList();
    }

    private void searchClient() {
        System.out.println("Enter client email:");
        String email = input.nextLine();

        Client client = FakeDb.INSTANCE.searchClient(email);

        if (client != null) {
            System.out.println(client.toString());
            System.out.println("Would you like to edit the current user? (y/n)");
            String needEdit = input.nextLine();

            if (needEdit.equals("Y") || needEdit.equals("y")) {
                this.editClient(client);
            }

        } else {
            System.out.println("Client has not been found! Please create the new client.");
        }

        this.getActionList();
    }

    private void editClient(Client client) {
        System.out.println("Enter your first name:");
        String firstName = input.nextLine();

        System.out.println("Enter your second name:");
        String secondName = input.nextLine();

        System.out.println("Enter your last name:");
        String lastName = input.nextLine();

        System.out.println("Enter your address:");
        String address = input.nextLine();

        client.update(firstName, secondName, lastName, address);
    }

    private void createAppointment() {

        this.getActionList();
    }
}
