import java.util.ArrayList;
import java.util.Random;

public class Food {

    public static ArrayList<Food> sweetsArray = new ArrayList<>();

    private String name;
    public String getName(){return this.name;}

    private int healFactor;
    public int getHealFactor() {return this.healFactor;}

    public Food(String name, int healFactor){   //оставил на всякий для тестов
        this.name = name;
        this.healFactor = healFactor;
        sweetsArray.add(this);
    }

    private String belongingTo;     //!!!! У КОГО ЛЕЖИТ В КАРМАНЕ !!!!
    public String getBelongingTo(){return belongingTo;}
    public void setBelongingTo(Entity one){this.belongingTo = one.getName();}

    Random randomer = new Random();

    public Food(){
        int num = randomer.nextInt(3);
        String[] foodName = new String[]{"Яблоко", "Сыр", "Мясо", "Сухарь"};
        this.name = foodName[num];
        this.healFactor = num^3;
        sweetsArray.add(this);
    }
}
