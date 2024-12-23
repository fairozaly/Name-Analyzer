import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for their full name
        System.out.print("What's your full name? ");
        String fullName = input.nextLine().trim();
        input.close();

        // Validate the input to ensure it contains at least a first and last name
        int spaceIndex = fullName.indexOf(' ');
        if (spaceIndex == -1) {
            System.out.println("Invalid input. Please provide both a first and last name.");
            return;
        }

        // Extract the first and last names
        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex + 1).trim();

        // Display the results
        System.out.println("Your first name is " + firstName + " and it has " + firstName.length() + " characters.");
        System.out.println("Your last name is " + lastName + " and it has " + lastName.length() + " characters.");

        // Calculate and display initials
        String initials = firstName.charAt(0) + "" + lastName.charAt(0);
        System.out.println("Your initials are " + initials.toUpperCase() + ".");
    }
}
