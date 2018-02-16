package inheritance.labs;

public class Mammal extends Predator {

    private boolean thickCoat;
    private boolean claws;

    // Mammal Constructor

    Mammal(boolean t, boolean c, int l, boolean s) {
        super(l,s);
        c = claws;
        t = thickCoat;
    }

    // Default Constructor
    Mammal() {

    }

    public boolean isThickCoat() {
        return thickCoat;
    }

    public void setThickCoat(boolean thickCoat) {
        this.thickCoat = thickCoat;
    }

    public boolean isClaws() {
        return claws;
    }

    public void setClaws(boolean claws) {
        this.claws = claws;
    }

    public int twoOrFour() {
        super.getLegs();
        return 4;

    }
}


