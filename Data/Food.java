public class Food {

    private String name;
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    private int healFactor;
    public int getHealFactor() {return this.healFactor;}
    public void setHealFactor(int healFactor) {this.healFactor = healFactor;}

    public Food(String name, int healFactor){
        this.name = name;
        this.healFactor = healFactor;
    }
}
