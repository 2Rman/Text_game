import Mob.Mob;
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
            int oneMob = (int) (Math.random() * 2);
            if ((Player.getStepCount() % 3 == 0) && (Mob.getMobcount() < 2))
            switch (oneMob) {
                case 0: {
                    Mob zombie = new Mob("Зомби", 20, 3);
                    System.out.println("Я чувствую поблизости врагов... Их " + Mob.getMobcount());
                    break;
                }

                case 1: {
                    Mob skeleton = new Mob("Скелет", 15, 5);
                    System.out.println("Врагов становится больше... Теперь их " + Mob.getMobcount());
                    break;
                }
            }


        } while (Player.getStepCount() < 11);

        System.out.println("\nТы благополучно выбрался из \"Сонного лабиринта\"! Мои поздравления, " + player1.getPlayerName() + "!!!");


    }
}
