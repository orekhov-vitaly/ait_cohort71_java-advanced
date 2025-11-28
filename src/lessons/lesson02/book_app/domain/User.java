package lessons.lesson02.book_app.domain;

public class User {
    private int id;
    private String name;
    private int age;
    private String address;
    private String email;
    private Role role;

    public User(int id, String name, int age, String address, String email, Role role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.role = role;
    }
}
