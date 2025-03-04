package ok;

import java.util.ArrayList;

class User {
    String userId;
    String username;
    String password;
    String email;

    
    public User(String userId, String username, String password, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
    }

   
    public static void registerUser(ArrayList<User> users, String userId, String username, String password, String email) {
        User newUser = new User(userId, username, password, email);
        users.add(newUser);
        System.out.println("User registered successfully!");
    }

   
    public static void loginUser(ArrayList<User> users, String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                System.out.println("Login successful! Welcome, " + user.username);
                return;
            }
        }
        System.out.println("Invalid username or password!");
    }

   
    public static void viewAccountDetails(ArrayList<User> users, String userId) {
        for (User user : users) {
            if (user.userId.equals(userId)) {
                System.out.println("User ID: " + user.userId);
                System.out.println("Username: " + user.username);
                System.out.println("Email: " + user.email);
                return;
            }
        }
        System.out.println("User not found!");
    }
}