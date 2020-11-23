package Player;

import Items.Food;

public class Player {
    private String playerName;
    private static int playerHealth;
    public int playerDamage;
    private static int playerBlocks;
    public int XP;
    private boolean playerAlive;
    private static int stepCount;
    private static int actionCount; // здесь будут складываться действия игорка для отстета момента атаки мобом игрока)
    private static int foodCount;


    /*public Player(String playerName, int playerHealth, int playerDamage) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.playerDamage = playerDamage;
        this.playerBlocks = 0;
        this.XP = 0;
        this.playerAlive = playerHealth > 0;
    }*/

    public Player(String playerName){
        this.playerName = playerName;
    }

    public Player(String playerName, int playerHealth){
        this.playerHealth = playerHealth;
        this.playerName = playerName;
    }



    public static void move() {
        int oneCase = (int) (Math.random() * 5);
        switch (oneCase){
            case 0 -> System.out.println("А я уж подумал, ты здесь хочешь остаться навсегда!");
            case 1 -> System.out.println("Конечно! Пойдем!");
            case 2 -> System.out.println("Скорее! Путь неблизкий!");
            case 3 -> System.out.println("Продвигаемся дальше");
            case 4 -> System.out.println("Несомненно! Идем же...");
            case 5 -> System.out.println("Больше жизни! Шевелись!");
        }
        stepCount++;
    }


    public static void mine(){
        playerBlocks++;
        System.out.println("Добываем блок земли. Количество блоков в инвентаре теперь: " + playerBlocks);
    }

    public static void install(){
        if (playerBlocks > 0) {
            playerBlocks--;
            System.out.println("Устанавливаем блок. Осталось блоков: " + playerBlocks);
        } else {
            System.out.println("А что ты собрался ставить? Сначала нужно выкопать хотя бы один блок земли");
        }
    }

    public static void eat(){
        if (foodCount > 0){
            Player.playerHealth = Player.playerHealth + Food.pointsToHeal;
        }
    }

    //возможно лишнее:
    public static void setStepCount(int stepCount) {
        Player.stepCount = stepCount;
        System.out.println(stepCount);
    }



    //Дальше геттеры потом сеттеры

    public String getPlayerName() {
        return playerName;
    }

    //возможно лишнее:
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    //возможно лишнее:
    public void setPlayerHealth(int playerHealth) {
        if (playerHealth > 0 && playerHealth < 101) {
            this.playerHealth = playerHealth;
        }
    }

    //возможно лишнее:
    public boolean getPlayerAlive() {
        return playerAlive;
    }

    //возможно лишнее:
    public void setPlayerAlive(boolean playerAlive) {
        this.playerAlive = getPlayerHealth() > 0 ;

    }

    public static int getStepCount() {
        return stepCount;
    }

    public int getPlayerBlocks() {
        return playerBlocks;
    }

}