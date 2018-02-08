package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */


class ClassA {
    static int x = 10;
    int y = 5;
}

class ClassX {
    public static void main(String[] args) {

        ClassA obj = new ClassA();
        System.out.println(obj.x);
        System.out.println(obj.y);

        ClassB object2 = new ClassB();
        System.out.println(object2.x);
        System.out.println(object2.y);

    }

}

class ClassB {
    static int  x = 99;
    int y = 55;

}

