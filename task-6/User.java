public class User {
    private String firstName, lastName, emailId;
    private long contactNumber;

    public User() {
    }

    public User(String firstName, String lastName, String emailId, long contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
    }

    public String toString() {
        return "First Name: " + firstName + ", Last Name: " + lastName + ", Email ID:" + emailId + ", Contact Number:"
                + contactNumber;
    }
}
