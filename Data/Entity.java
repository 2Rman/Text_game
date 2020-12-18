public class Entity {

    private String name;
    public String getName(){return this.name;}
    public void setName(String entityName){this.name = entityName;}

    private int health;
    public int getHealth(){return this.health;}
    public void setHealth(int entityHealth){this.health = entityHealth;}

    private int damage;
    public int getDamage(){return this.damage;}
    public void setDamage(int entityDamage){this.damage = entityDamage;}

    boolean isAlive = true;
    public boolean getIsAlive(){return this.isAlive;}
    public void setIsAlive(){isAlive = this.health > 0;}

    public Entity(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public Entity(String name){
        this.name = name;
    }

}
