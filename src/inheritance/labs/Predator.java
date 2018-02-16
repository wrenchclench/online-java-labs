package inheritance.labs;

public class Predator {

    private int legs;
    private boolean sharpTeeth;

    // Predator Constructor

    Predator(int l, boolean s) {
        l = legs;
        s = sharpTeeth;
    }

    // Default Constructor
    Predator () {

    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isSharpTeeth() {
        return sharpTeeth;
    }

    public void setSharpTeeth(boolean sharpTeeth) {
        this.sharpTeeth = sharpTeeth;
    }


}


