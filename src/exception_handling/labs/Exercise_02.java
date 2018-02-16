package exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


class Demo2 {
    public static void main(String[] args) {
        int nums[] = new int [3];

        try {
            nums[4] = 99;
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception - Index out of bounds");
        }

        catch (ArrayStoreException exc) {
            System.out.println("Exception - Array only accepts integers");
        }
    }
}