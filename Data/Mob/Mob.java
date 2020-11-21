package Mob;

public class Mob {
    private String name;
    private int health;
    private int damage;
    public boolean IsAlive;
    public static int MobCount;

    public Mob() {
        MobCount++;
    }

    public Mob(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.IsAlive = health > 0;
        MobCount++;
    }

}
