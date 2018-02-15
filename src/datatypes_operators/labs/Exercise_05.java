package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_05{

    public static int  findIndex(int[] array, int n) {
        if (array == null)
            return -1;

        int len = array.length;
        int i = 0;

        while (i < len) {
            if (array[i] == n)
                return i;
            else i = i + 1;
        }

        return -1;
    }

    public static void main(String[] args)
            throws java.io.IOException{

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.print("Enter number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Index position of " + n +" is: " + findIndex(array, n));

    }
}




