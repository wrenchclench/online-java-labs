package exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 * <p>
 * Demonstrate a nested try/catch.
 *


class Demo4 {
    public static void main(String[] args) {
        int nums[] = new int[3];

        try {
            nums[4] = 99;

            try {
                nums[1] = "Letter";
            }
            catch (ArrayStoreException exc) {
                System.out.println("Exception - Array only accepts integers");
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception - Index out of bounds");
        }
    }
}
 **/