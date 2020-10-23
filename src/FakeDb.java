import java.util.ArrayList;

public class FakeDb {
    private User[] staff = {
            new Doctor("doctor", "12345"),
            new Admin("admin", "1234")
    };
    private ArrayList<Client> clients = new ArrayList<Client>();

    private FakeDb() {}

    public User[] getStaff() {
        return this.staff;
    }

    public ArrayList<Client> getClients() {
        return this.clients;
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public Client searchClient(String email) {
        for(int i = 0; i < this.clients.size(); i++) {
            Client client = this.clients.get(i);

            if(client.getEmail().equals(email)) {
                return client;
            }
        }

        return null;
    }

    public static final FakeDb INSTANCE = new FakeDb();
}