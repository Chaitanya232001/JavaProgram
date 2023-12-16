//Write a function to check if a given string is a palindrome (reads the same forwards and backwards) while ignoring spaces, punctuation, and capitalization.
package OnlineSource.OnlineSource;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String forwardName = input.nextLine();

        // Remove spaces and convert to lowercase
        forwardName = forwardName.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String reversedName = reverseString(forwardName);

        System.out.println("Your name is: " + forwardName);
        System.out.println("Your name in reverse is: " + reversedName);

        if (forwardName.equals(reversedName)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }

        input.close();
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

