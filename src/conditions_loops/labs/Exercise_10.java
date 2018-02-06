package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    public static void main(String[] args){
        int i;
        for (i = 0; i < 100; i++)
            if (i == 56)
                continue;

        System.out.println("let's stop at 56 and then keep goin");
        System.out.println(i);
    }
}
