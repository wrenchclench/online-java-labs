package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_06 {

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int t,i;
        int table [][] = new int [5][5];

        for(t = 0; t < 5; ++t) {
            for (i = 0; i <5; ++i){
                table[t][i] = (t*5) +i*3;

            }
        }
        for (int[] row : table){
            printRow(row);
        }

    }
}



