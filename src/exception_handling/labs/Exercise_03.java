package exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */


class Demo3 {
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

        finally {
            System.out.println("Try Again");
        }
    }
}