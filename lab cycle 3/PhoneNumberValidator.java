package labexperiments;

import java.util.Scanner; // Importing Scanner class for user input

// Custom Exception class for Invalid Phone Number
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

// Main class to validate phone numbers
public class PhoneNumberValidator {

    // Method to validate the phone number
    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        // Regular expression check: Phone number must be exactly 10 digits
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        try {
            validatePhoneNumber(phoneNumber);
            System.out.println("Phone number is valid.");
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Invalid Phone Number: " + e.getMessage());
        }

        scanner.close(); // ✅ clean and valid line
    }
}
