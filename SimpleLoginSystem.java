1  import java.util.HashMap;
2  import java.util.Scanner;
3
4  public class SimpleLoginSystem {
5      public static void main(String[] args) {
6          // Store dummy credentials (username -> password)
7          HashMap<String, String> credentials = new HashMap<>();
8          credentials.put("admin", "1234");
9          credentials.put("user1", "pass1");
10         credentials.put("ankit", "java123");
11
12         Scanner sc = new Scanner(System.in);
13
14         System.out.println("===== LOGIN SYSTEM =====");
15         System.out.print("Enter username: ");
16         String username = sc.nextLine();
17
18         System.out.print("Enter password: ");
19         String password = sc.nextLine();
20
21         // Check if username exists and password matches
22         if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
23             System.out.println("✅ Login successful! Welcome, " + username + "!");
24         } else {
25             System.out.println("❌ Login failed! Invalid username or password.");
26         }
27
28         sc.close();
29     }
30 }
