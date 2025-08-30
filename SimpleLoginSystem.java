import java.util.HashMap;
import java.util.Scanner;

public class SimpleLoginSystem {
    public static void main(String[] args) {
        // Store dummy credentials (username -> password)
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("admin", "1234");
        credentials.put("user1", "pass1");
        credentials.put("ankit", "java123");

        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        System.out.println("===== LOGIN SYSTEM =====");

        while (!loggedIn) {
            System.out.print("\nEnter username (or type 'exit' to quit): ");
            String username = sc.nextLine().trim();

            // Allow user to quit
            if (username.equalsIgnoreCase("exit")) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            System.out.print("Enter password: ");
            String password = sc.nextLine().trim();

            // Check credentials
            if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
                System.out.println(" Login successful! Welcome, " + username + "!");
                loggedIn = true;
            } else {
                System.out.println(" Login failed! Invalid username or password. Please try again.");
            }
        }

        sc.close();
    }
}

