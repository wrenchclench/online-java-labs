package exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */


class Demo1 {
    public static void main(String[] args) {
        int nums[] = new int [3];

        try {
            nums[4] = 99;
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception - Index out of bounds");
        }
    }
}
