package exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 * <p>
 * Demonstrate how to throw an exception.
 */


class Demo5 {
    public static void main(String[] args) {

        try {
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            System.out.println("gotcha");
        }
    }
}
