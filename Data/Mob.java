import java.util.ArrayList;
import java.util.Random;

public class Mob extends Entity{

    Random random = new Random();

    public Mob(String name){
        super(name);
        this.setHealth(20+ random.nextInt(81));
        this.setDamage(5 + random.nextInt(6));
        this.expToPlayer = Math.round(this.getHealth()/3);
        //if (this.getHealth() > 50){}                      //если здоровье выпло больше 50, то дать какую нибуть плюшку в карман
        mobArray.add(this);
    }

    public static ArrayList <Mob> mobArray = new ArrayList<>();

    private final int expToPlayer;
    public int getExpToPlayer(){return this.expToPlayer;}

    @Override
    public void setIsAlive(){
        if (this.getHealth() <= 0){
            this.isAlive = false;
            mobArray.remove(this);
        }
    }

    public void attack(Entity Player){
        do{
            if (!mobArray.isEmpty()){
                this.setHealth(this.getHealth() - Player.getDamage());
                Player.setHealth(Player.getHealth() - this.getDamage());
                Player.setIsAlive();
                this.setIsAlive();
            }
        } while ((!Player.getIsAlive() || (!this.getIsAlive())));
    }
}
