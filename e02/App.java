import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = scanner.nextLine();

        System.out.println("You enterd:" + name);

        for (int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
        scanner.close();
    }


}