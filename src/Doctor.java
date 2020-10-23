import java.util.InputMismatchException;

public class Doctor extends User {

    public Doctor(String login, String password) {
        super(login, password);
    }

    public void getActionList() {
        System.out.println("1. Show client information");
        System.out.println("2. Create admission form");
        System.out.println("3. Create invoice document");

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
                this.showClientInfo();
                break;
            case 2:
                this.createAdmissionForm();
                break;
            case 3:
                this.createInvoiceDocument();
                break;
            default:
                int newPoint = input.nextInt();

                this.executeAction(newPoint);
        }
    }

    private void showClientInfo() {
        System.out.println("Enter client email:");
        String email = input.nextLine();

        Client client = FakeDb.INSTANCE.searchClient(email);

        if (client != null) {
            System.out.println(client.toString());
        } else {
            System.out.println("Client has not been found! Please contact your administrator.");
        }

        this.getActionList();
    }

    private void createAdmissionForm() {

        this.getActionList();
    }

    private void createInvoiceDocument() {

        this.getActionList();
    }
}
