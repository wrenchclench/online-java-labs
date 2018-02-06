package conditions_loops.labs;
import java.util.Scanner;


/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
**/

public class Exercise_05 {

    public static void main(String[] args){

        int total = 0;
        int count = 0;

        // create scanner
        Scanner scanner = new Scanner(System.in);

        // Get first number
        // prompt user
        System.out.print("Give me a number: ");
        // assign input to variable as int
        int num1 = scanner.nextInt();

        int num2 = 0;

        do {
            System.out.println("Please enter a new number: ");
            num2 = scanner.nextInt();
        } while (num1 > num2);

        for (int i = num1; i <= num2; i++) {
            total += i;
            count++;
        }

        System.out.println("Sum of all numbers between " + num1 + " and " + num2 + " is: " + total
            + " The average is " + (total/count));

    }
}
