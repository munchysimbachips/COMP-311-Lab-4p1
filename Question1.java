package lab4;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        String[] names = new String[20];
        int count = 0;

        try (Scanner console = new Scanner(new FileReader("names.txt"))) {
            while (console.hasNextLine() && count < names.length) {
                names[count] = console.nextLine();
                count++;
                System.out.println("Successful read operation!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;
        }

        // Print only the slots we actually filled
        System.out.println("\nNames read:");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i]);
        }
    }
}