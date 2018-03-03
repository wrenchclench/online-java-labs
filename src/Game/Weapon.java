package Game;

public class Weapon {

   private int damage;
   private double accuracy;

    public Weapon(int damage, double accuracy) {
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }
}
