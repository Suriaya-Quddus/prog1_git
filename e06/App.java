
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Palindrome test, please enter some text (or type Quit to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Quit")) {
                break;
            }

            // Preprocess the input: Remove spaces and punctuation, and normalize case
            String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

           
            String reversed = new StringBuilder(processed).reverse().toString();

            if (processed.equals(reversed)) {
                System.out.println(input + " is a palindrome");
            } else {
                System.out.println(input + " is not a palindrome");
            }
        }

        scanner.close();
    }
} 
