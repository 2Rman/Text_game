package Mob;

public class Mob {
    private static String name;
    private static int health;
    private int damage;
    public boolean isAlive;
    private static int mobCount;

    public Mob() {
        mobCount++;
    }

    public Mob(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.isAlive = health > 0;
        mobCount++;
    }

    public static int getMobcount(){
        return mobCount;
    }

    public static String getName(){
        return Mob.name;
    }

    public int getMobHealth(){
        return this.health;
    }

    public void setMobHealth(int currentHealth){
        this.health = currentHealth;
    }

}
