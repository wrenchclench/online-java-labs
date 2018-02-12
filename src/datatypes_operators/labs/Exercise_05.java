package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_05{

    public static int  findIndex (int[] array, int t) {
        if (array == null) return -1;
        int len = array.length;
        int i = 0;
        while (i < len) {
            if (array[i] == t) return i;
            else i = i + 1;
        }
        return -1;
    }

    public static void main(String[] args)
            throws java.io.IOException{

            int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

            System.out.print("Enter number between 1 and 10: ");
            int n = System.in.read();

        System.out.println("Index position of " + n +" is: " + findIndex(array, n));

            }






    }




/** public class Exercise6 {

    public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
    }
 }
 **/