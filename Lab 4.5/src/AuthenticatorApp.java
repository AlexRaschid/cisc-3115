import java.util.*;

class AuthenticatorApp {
        public static void main(String [] args) throws Exception {
                Authenticator authenticator = new Authenticator("users.data");
                Scanner keyboard = new Scanner(System.in);
                int failCount = 0;
                boolean done = false;
                while (!done) {
                        try {
                                System.out.print("username? ");
                                String username = keyboard.next();
                                System.out.print("password? ");
                                String password = keyboard.next();
                                authenticator.authenticate(username, password);
                                done = true;
                        } catch (Exception e) {
                                System.out.println("*** " + e.getMessage());
                                failCount++;
                                if (failCount == 3) {
                                        System.out.println("Too many failed attempts... please try again later");
                                        System.exit(0);
                                }
                        }
                }
                System.out.println("Welcome to the system");
        }
}