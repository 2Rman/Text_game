package Mob;

public class Mob {
    String name;
    int health;
    int damage;
    boolean IsAlive;

    public Mob(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.IsAlive = health > 0;
    }
}
