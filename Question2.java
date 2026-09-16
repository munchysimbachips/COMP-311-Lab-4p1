package lab4;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class Question2 {
    public static void main (String[] args){

        try{
            //create writer object
            PrintWriter pw = new PrintWriter("arraysq2.txt");
            //scanner creation
            Scanner console = new Scanner(System.in);

                    
            //variable declaration
            double arr1[] = new double[10];


            System.out.println("Operation commenced!");

            for (int i = 0; i < 10; i++){
                System.out.print("Enter a double value: "); arr1[i] = console.nextDouble();
                pw.println(arr1[i]);
            }
            System.out.print("Successful operation!");
        } catch (IOException e){
            System.out.print("Unsuccessful writing operation!");
        }

}
}
