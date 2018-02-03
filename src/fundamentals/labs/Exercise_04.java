package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        double r,h,p,a;
        // radius
        r = 3.14;
        // height
        h = 5;
        // Perimeter formula
        p = (r*2) + (h*2);
        // Area formula
        a = (2*Math.PI*r*h) + (2*Math.PI*Math.pow(r,2));



        System.out.println ("Perimeter is " + p);
        System.out.println ( "Area is " + a);
    }
}
