package project;

import java.util.LinkedList;
import java.util.Scanner;

// ✅ Class name should start with uppercase for Java convention
class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}

public class AuthenticationSystem {
    private LinkedList<User> userList;

    // ✅ Constructor (no return type)
    public AuthenticationSystem() {
        userList = new LinkedList<>();
    }

    public void register(String name, String password) {
        User newUser = new User(name, password);
        userList.add(newUser);
        System.out.println("User registered successfully!");
    }

    public boolean login(String name, String password) {
        for (User user : userList) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                System.out.println("Login successful. Welcome, " + name + "!");
                return true;
            }
        }
        System.out.println("Login failed. Invalid credentials.");
        return false;
    }

    public static void main(String[] args) {
        AuthenticationSystem system = new AuthenticationSystem();
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String regName = sc.nextLine();
                    System.out.print("Enter password: ");
                    String regPassword = sc.nextLine();
                    system.register(regName, regPassword);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String loginName = sc.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = sc.nextLine();
                    loggedIn = system.login(loginName, loginPassword);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
