package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 * <p>
 * Create a class that demonstrates the following: (all methods below can be in the same class)
 * <p>
 * 1) A static method that calls another static method.
 * 2) A static method that calls a non-static method.
 * 3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 * 4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 *
 * **/



class s1 {
    public static void main(String[] args) {
        methodA();

        s1 obj = new s1();
        int a = obj.methodC();


    }

    public static void methodA() {

        methodB();
    }

    public static void methodB() {
        int x = 5;
        int y = 10;

        System.out.println(x + y);


    }

    public int methodC() {
        return 5;
    }
}

  class s2 {
    public static void someMeth() {

    }

    public void someOther() {

    }
  }





