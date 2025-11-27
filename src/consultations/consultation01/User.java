package consultations.consultation01;

public class User {
    private static int counter;
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        counter++;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCounter() {
        return counter;
    }
}
