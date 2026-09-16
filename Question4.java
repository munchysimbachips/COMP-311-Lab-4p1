package lab4;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
	//scanner object creation
        Scanner console = new Scanner(System.in);
	//prompt and accept interger value from user
        System.out.print("Enter a whole number: ");
        int number = console.nextInt();

        //handles 0 input
        if (number == 0) {
            System.out.println("Binary representation: 0");
            console.close();
            return;
        }

        int temp = Math.abs(number);
        String binary = "";

        //successive division algorithm to convert decimal to binary
        while (temp > 0) {
            int remainder = temp % 2;
            binary = remainder + binary; // Prepend remainder
            temp /= 2;
        }

        //handle negative numbers if entered
        if (number < 0) {
            binary = "-" + binary;
        }

        System.out.println("Binary representation: " + binary);

        console.close();
    }
}