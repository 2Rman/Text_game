import Player.Player;

import java.util.Scanner;

public class GameStart {

    public static void main(String[] args) {


        Spirit.firstWords();                                         //вступление


        Scanner texter = new Scanner(System.in);                     //вводим имя игрока
        String newbie = texter.nextLine();

        Player player1 = new Player(newbie, 100);


        Spirit.secondWords(newbie, player1.getPlayerHealth());      //как играть, доступные действия

                                                 //основная часть игры
        do {
            String action = texter.nextLine();
            Spirit.gameCases(action);
            
        } while (player1.getStepCount() < 6);

        System.out.println("\nТы благополучно выбрался из \"Сонного лабиринта\"! Мои поздравления, " + player1.getPlayerName() + "!!!");


    }
}
