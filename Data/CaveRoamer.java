import java.sql.SQLOutput;
import java.util.Scanner;

public class CaveRoamer {



    public static void main(String[] args) {

        Scanner dialog = new Scanner(System.in);
        String playerName = dialog.nextLine();

        Player knight = new Player(playerName, 100, 10 );

        Mob skeleton = new Mob("Cкелет");
        Mob zombie = new Mob("Зомби");
        Mob spider = new Mob("Павук");

        System.out.println(Mob.mobArray.size() + " " + knight.getExp());

        System.out.println(skeleton.getHealth() + " " + skeleton.getDamage());
        System.out.println(zombie.getHealth() + " " + zombie.getDamage());
        System.out.println(spider.getHealth() + " " + spider.getDamage());

        System.out.println("Битва между " + knight.getName() + " и " + skeleton.getName());
        System.out.println("Битва между " + knight.getName() + " и " + zombie.getName());
        System.out.println("Битва между " + knight.getName() + " и " + spider.getName());

        System.out.println(Mob.mobArray.size() + " " + knight.getExp());
    }

}
