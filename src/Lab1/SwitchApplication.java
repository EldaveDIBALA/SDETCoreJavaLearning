package Lab1;

import java.util.Scanner;

public class SwitchApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your environement : ");
        String keyboardInput = scanner.nextLine();

        switch (keyboardInput.toUpperCase()) {
            case "DEV", "BUILD", "QA", "STAGE", "PROD":
                System.out.println("Test case is executing on " + keyboardInput +".");
                break;
            default:
                System.out.println("Please, enter a registered environement.");
        }

        scanner.close();
    }
}
