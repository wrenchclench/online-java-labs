package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args){
        int i;
        for (i = 0; i < 100; i++)
        if (i == 56)
        break;
        System.out.println("let's stop at 56!");
    }
}
