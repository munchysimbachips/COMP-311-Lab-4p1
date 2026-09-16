package lab4;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = console.nextLine();

        // Build a cleaned string containing only letters and digits
        String cleaned = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (Character.isLetterOrDigit(ch)) {
                cleaned += ch;
            }
        }

        boolean isPalindrome = true;
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
	
	//handles results display
        if (isPalindrome && !cleaned.isEmpty()) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        console.close();
    }
}