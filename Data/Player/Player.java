package Player;

public class Player {
    private String playerName;
    public int playerHealth;
    public int playerDamage;
    private int playerBlocks;
    public int XP;
    private boolean playerAlive;
    private static int stepCount;

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




    public static void move(){
        System.out.println("Продвигаемся вперед");
        stepCount++;
    }

    public static void how(){
        System.out.println("1. \"идти\" - движемся.");
        System.out.println("2. \"добыть\" - выкопать блок.");
        System.out.println("3. \"поставить\" - установить блок, если есть в инвентаре.");
        System.out.println("4. \"есть\" - повысить уровень здоровья, если есть припасы.");
        System.out.println("5. \"атака\" - ударить противника.");
        System.out.println("6. \"взять\" - подобрать выпавший из противника предмет.");
        System.out.println("7. \"как\" - вывести доступные действия.");
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

    public void setPlayerHealth(int playerHealth) {
        if (playerHealth > 0 && playerHealth < 101) {
            this.playerHealth = playerHealth;
        }
    }

    public boolean getPlayerAlive() {
        return playerAlive;
    }

    public void setPlayerAlive(boolean playerAlive) {
        this.playerAlive = getPlayerHealth() > 0 ;

    }

    public int getStepCount() {
        return stepCount;
    }

}