package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */


class Main {
    public static void main(String[] args) {

        int x;
        int y;
        int z;

        Main object1 = new Main();
        Numbers object2 = new Numbers();
        MoreNumbers object3 = new MoreNumbers();


        int f = object2.method1();
        int g = object3.method2();



    }

}

class Numbers {
    public int method1() {
        int x = 5;
        int y = 9;
        int z = 11;

        int sum = (x + y + z);
        return sum;
    }

}

class MoreNumbers {
    public int method2() {
        int a = 100;
        int b = 45;
        int c = 77;

        int product = (a * b * c);
        return product;
    }
}






