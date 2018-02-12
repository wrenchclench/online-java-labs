package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        int table[][] = new int[3][]; // make 3 rows
        table[0] = new int[3]; //3 columns
        table[1] = new int[1]; //1  column
        table[2] = new int[4]; // 4 columns

        int count = 0;
        int i, j;
        for (i = 0; i < table.length; i++)
            for (j = 0; j < table[i].length; j++)
                table[i][j] = count++;


        System.out.println("Contents table");
        for (i = 0; i < table.length; i++) {
            for (j = 0; j < table[i].length; j++)
                System.out.print(table[i][j] + " ");
            System.out.println();

        }
    }
}
