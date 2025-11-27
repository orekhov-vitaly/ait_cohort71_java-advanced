package consultations.consultation01;

public class UserExample {
    public static void main(String[] args) {
        User user1 = new User("Sergey", "sergey@email.com");
        System.out.println("Общее количество пользователей: " + User.getCounter());
        User user2 = new User("Vitalii", "vitalii@email.com");
        System.out.println("Общее количество пользователей: " + User.getCounter());
        User user3 = new User("Elena", "elena@email.com");
        System.out.println("Общее количество пользователей: " + User.getCounter());
    }
}
