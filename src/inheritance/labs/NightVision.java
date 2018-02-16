package inheritance.labs;

public class NightVision extends Mammal {

    NightVision(boolean n, int k) {
        // super (t,c);
        n = nightVision;
        k = avgLitter;
    }

    public boolean isNightVision() {
        return nightVision;
    }

    public void setNightVision(boolean nightVision) {
        this.nightVision = nightVision;
    }

    public int getAvgLitter() {
        return avgLitter;
    }

    public void setAvgLitter(int avgLitter) {
        this.avgLitter = avgLitter;
    }

    private boolean nightVision;
    private int avgLitter;


}
