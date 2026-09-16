package lab4;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class Question3 {
    public static void main(String[] args){
        try{
            System.out.println("Successfully Performing operation!");
            //create scanner
            Scanner console = new Scanner(System.in);
            //create writer
            PrintWriter pw = new PrintWriter("arraysq3.txt");
            //create array to read values
            int arr2[] = new int[10]; int temp[] = new int[10];  
            int sum = 0; int sInput = 0; int lInput = 0;

            for (int i = 0; i < 10; i++){
                //prompt and accept input
                System.out.print("Enter an interger value: "); 
                temp[i] = console.nextInt();
                if (temp[i] >= 0){
                    arr2[i] = temp[i];
                } else {
                    arr2[i] = 0;
                }
                //compute sum
                sum += arr2[i];
            }

            sInput = arr2[0];
            lInput = arr2[0];
            for (int j = 1; j < arr2.length; j++){
                if (arr2[j] < sInput) sInput = arr2[j];
                if (arr2[j] > lInput) lInput = arr2[j];
            }

            //display sum
            System.out.println("Sum = " + sum);
            pw.println("Sum = " + sum);

            //display smallest number
            System.out.println("Smallest input = " + sInput);
            pw.println("Smallest number = " + sInput);
            //display largest number
            System.out.println("Largest number = " + lInput);
            pw.println("Largest number = " + lInput);

            pw.close();
        } catch (IOException e){
            System.out.print("Unsuccessful Operation!");
        }
    }
}
