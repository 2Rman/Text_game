import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Player extends Entity{

    public Player(String name, int health, int damage, int exp){
        super(name, health, damage);
        this.exp = exp;
    }

    public static ArrayList <Food> foodArray = new ArrayList<>();

    private int countSteps;
    public int getCountSteps(){return this.countSteps;}

    private int exp;                    //ОПЫТ надо сделать чтоб если больше 100 - обнуляется и добавляется к ХП или ДП
    public int getExp(){return this.exp;}
    public void setExp(int exp){this.exp += exp;}

    public void attack(Mob victim){     //бьем моба долго и упорно
        do{
            if (!Mob.mobArray.isEmpty()){
                this.setHealth(this.getHealth() - victim.getDamage());
                victim.setHealth(victim.getHealth() - this.getDamage());
                System.out.println("Mob " + victim.getHealth() + " Player " + this.getHealth());
                victim.setIsAlive();
                this.setIsAlive();
                if (!victim.getIsAlive()) this.exp += victim.getExpToPlayer();
                System.out.println(Mob.mobArray.toString());
            }
        } while (victim.getIsAlive() && this.getIsAlive());
    }

    private int playerBlocks;       //все касаемое блоков землицы
    public int getPlayerBlocks(){return playerBlocks;}
    public void digBlock(){this.playerBlocks += 1;}
    public void installBlock(){this.playerBlocks -= 1;}

    public void goForward(){countSteps++;}  //тупо топаем

    public void feed(Food sweets){      //кушаем но пока не дошел до того как не съесть еду, которая у моба
        this.setHealth(this.getHealth()+sweets.getHealFactor());
        Food.sweetsArray.remove(sweets);
    }

}
