package generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */


class Demo <X,Y>{

    X object1;
    Y object2;

    public Demo(X object1, Y object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public X getObject1() {
        return object1;
    }

    public void setObject1(X object1) {
        this.object1 = object1;
    }

    public Y getObject2() {
        return object2;
    }

    public void setObject2(Y object2) {
        this.object2 = object2;
    }

}

class Demo2 {
    public static void main(String args[]) {
        // Create a Gen reference for Integers.
        Demo<Integer, String> object1;

        object1 = new Demo<Integer, String>(88, "Test");
    }
}
