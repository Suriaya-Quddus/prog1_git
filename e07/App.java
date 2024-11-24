import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            isValid = validatePassword(password);

            if (isValid) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter, one lowercase letter, and one digit.");
            }
        }

        scanner.close();
    }

    public static boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false; 
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit;
    }
}

