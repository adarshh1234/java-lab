package labexperiments;
import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        
        if (input.equalsIgnoreCase(new StringBuilder(input).reverse().toString())) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        
        
        scanner.close();
    }
}
