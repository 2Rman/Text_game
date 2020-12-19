import java.util.Scanner;

public class CaveRoamer {

    public static void main(String[] args) {

        Spirit.firstWords();

        Scanner dialog = new Scanner(System.in);
        String playerName = dialog.nextLine();
        Player knight = new Player(playerName, 100, 100, 0 );

        Spirit.secondWords(playerName, knight.getHealth());

        Mob skeleton = new Mob("Cкелет");
        Mob zombie = new Mob("Зомби");
        Mob spider = new Mob("Павук");

        do Spirit.gameCases(dialog.nextLine(), knight); while (knight.getCountSteps() < 4 || (!knight.isAlive));

        if (knight.getCountSteps() == 4){
            System.out.println("Ты дошел до выхода из лабиринта");
        } else System.out.println("Что ж... значит, ты мой компаньон на веки...");

    }

}
