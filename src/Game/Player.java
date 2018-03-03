package Game;

public class Player {

    // Health
    private int health = 100;

    // Player Name
    private String name;

    // Weapon
    private int weapon;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public Player(int health, String name, int weapon) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;

    }
}

