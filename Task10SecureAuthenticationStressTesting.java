import java.util.*;
import java.util.function.BiPredicate;

public class Task10SecureAuthenticationStressTesting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, String> users = new HashMap<>();
        users.put("admin", "admin123");
        users.put("user123", "password123");
        users.put("testuser", "test1234");

        BiPredicate<String, String> authenticate = (username, password) -> {

            if (username.length() < 3 || username.length() > 20)
                return false;

            if (password.length() < 6 || password.length() > 20)
                return false;

            if (username.isEmpty() || password.isEmpty())
                return false;

            if (username.contains(" ") || password.contains(" "))
                return false;

            return users.containsKey(username)
                    && users.get(username).equals(password);
        };

        for (int i = 0; i < n; i++) {

            String username = sc.next();
            String password = sc.next();

            try {
                boolean result = authenticate.test(username, password);

                System.out.println(result ? "SUCCESS" : "FAILURE");

            } catch (Exception e) {
                System.out.println("FAILURE");
            }
        }

        sc.close();
    }
}