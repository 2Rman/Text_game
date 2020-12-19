import java.util.ArrayList;
import java.util.Random;

public class Mob extends Entity{

    private Random random = new Random();

    public Mob(String name){
        super(name);
        this.setHealth(20+ random.nextInt(81)); //рандомное здоровье
        this.setDamage(5 + random.nextInt(6));  //рандомный дамаг
        this.expToPlayer = Math.round(this.getHealth()/3);
        if (this.getHealth() > 50){     //если здоровье выпло больше 50, то дать какую нибуть плюшку в карман
            Food sweety = new Food();
            sweety.setBelongingTo(this);    //устанавливаем у кого в кармане
        }
        mobArray.add(this);                 //добавляем к кучу мобов
    }

    public static ArrayList <Mob> mobArray = new ArrayList<>();

    private final int expToPlayer;          //экспа для игрока
    public int getExpToPlayer(){return this.expToPlayer;}

    @Override
    public void setIsAlive(){               //специфисская установка состояния "жив ли"
        if (this.getHealth() <= 0){
            this.isAlive = false;
            //Food.sweetsArray.get();
            mobArray.remove(this);
        }
    }

    public void attack(Entity Player){      //нереализованная атаа игрока, если тот слишком долго тупит(копает, ходит)
        do{
            if (!mobArray.isEmpty()){
                this.setHealth(this.getHealth() - Player.getDamage());
                Player.setHealth(Player.getHealth() - this.getDamage());
                Player.setIsAlive();
                this.setIsAlive();
            }
        } while ((!Player.getIsAlive() || (!this.getIsAlive())));   //ТУПЫЕ УСЛОВИЯ ВРОДЕ ПРОСТО, НО ТАК И НЕ ОСВОИЛ
    }
}
