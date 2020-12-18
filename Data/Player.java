import java.util.ArrayList;

public class Player extends Entity{

    public Player(String name; int health, int damage, int exp){
        super(name, Health, damage);
        this.exp = exp;
    }

    public static ArrayList <Food> foodArray = new ArrayList<>();

    private int countSteps;
    public int getCountSteps(){return this.countSteps;}

    private int exp;
    public int getExp(){return this.exp;}
    public void setExp(int exp){this.exp += exp;}

    public void attack(Mob victim){
        do{
            if (!Mob.mobArray.isEmpty()){
                this.setHealth(this.getHealth() - victim.getDamage());
                victim.setHealth(victim.getHealth() - this.getDamage());
                victim.setIsAlive();
                this.setIsAlive();
                if (!victim.getIsAlive()) this.exp += victim.getExpToPlayer();
            }
        } while (victim.getIsAlive() && this.getIsAlive());
    }

    private int playerBlocks;
    public int getPlayerBlocks(){return playerBlocks;}
    public void setPlayerBlocks(int playerBlocks){this.playerBlocks = playerBlocks;}

     public void digBlock(){this.playerBlocks += 1;}

     public void installBlock(){this.playerBlocks -= 1;}

     public void goForward(){countSteps++;}

     public void feed(int sweets){this.setHealth(this.getHealth()+sweets);}

}
