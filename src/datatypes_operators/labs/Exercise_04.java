package datatypes_operators.labs;
import java.util.Scanner;
/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_04{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: " );
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element "+ (i + 1) + ": ");
            int a = sc.nextInt();
            sum += a;
        }

        double average = sum / n;

        System.out.println("Average value of array elements is : " + average);
    }

}




