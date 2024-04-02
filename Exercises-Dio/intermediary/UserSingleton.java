import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private final int id;
    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class UserManager {
    private static UserManager INSTANCE;
    private List<User> users = new ArrayList<>();

    private UserManager() {
        // Private constructor to prevent direct instantiation
    }

    public static UserManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserManager();
        }
        return INSTANCE;
    }

    public void addUser(String name) {
        User user = new User(users.size() + 1, name);
        users.add(user);
    }

    public void listUsers() {
        for (User user : users) {
            System.out.println(user.getId() + " - " + user.getName());
        }
    }
}

public class UserSingleton {
    private static final List<User> users = new ArrayList<>();

    // Singleton pattern: Ensure only one instance of UserManager exists
    private static final UserManager userManager = UserManager.getInstance();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        scanner.nextLine();  // Consume the newline after reading the number

        for (int i = 1; i <= quantity; i++) {
            String name = scanner.nextLine();
            userManager.addUser(name);
        }

        userManager.listUsers();
    }
}