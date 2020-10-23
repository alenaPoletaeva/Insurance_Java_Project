import java.util.Formatter;
import java.util.UUID;

public class Client {
    private String firstName;
    private String secondName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String address;
    private String id;

    public Client(
       String firstName,
       String secondName,
       String lastName,
       String dateOfBirth,
       String gender,
       String email,
       String address
    ) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void update(String firstName, String secondName, String lastName, String address) {
        this.firstName = firstName.equals("") ? this.firstName : firstName;
        this.secondName = secondName.equals("") ? this.secondName : secondName;
        this.lastName = lastName.equals("") ? this.lastName : lastName;
        this.address = address.equals("") ? this.address : address;
    }

    public String toString() {
        Formatter formatter = new Formatter();

        formatter.format(
                "Name: %s, Second name: %s, Last name: %s, Date of Birth: %s, Gender: %s, Email: %s, Address: %s",
                this.firstName,
                this.secondName,
                this.lastName,
                this.dateOfBirth,
                this.gender,
                this.email,
                this.address
        );

        return formatter.toString();
    }
}
