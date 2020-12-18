//import Entity;
//import Player;

import java.util.Scanner;

public class GameStart {

    public static void main(String[] args) {

        Spirit.firstWords();                                         //вступление

        Scanner texter = new Scanner(System.in);                     //вводим имя игрока
        String newbie = texter.nextLine();

        //Entity player = new Player(newbie,100);

        //Spirit.secondWords(player.getName(), player.getHealth());   //как играть, доступные действия
/*
                                                 //основная часть игры
        do {
            String action = texter.nextLine();
            Spirit.gameCases(action);
            int oneMob = (int) (Math.random() * 2);
            if ((Player.getStepCount() % 3 == 0) && (mobsOnMap.size() < 2))
            switch (oneMob) {
                case 0: {
                    Mob zombie = new Mob("Зомби", 20, 3);
                    mobsOnMap.add(zombie);
                    System.out.println("Я чувствую поблизости врагов... Их " + mobsOnMap.size());
                    break;
                }

                case 1: {
                    Mob skeleton = new Mob("Скелет", 15, 5);
                    mobsOnMap.add(skeleton);
                    System.out.println("Врагов становится больше... Теперь их " + mobsOnMap.size());
                    break;
                }
            }


        } while (Player.getStepCount() < 11);

        System.out.println("\nТы благополучно выбрался из \"Сонного лабиринта\"! Мои поздравления, " + player1.getPlayerName() + "!!!");
        System.out.println("На карте осталось " + mobsOnMap.size() + " врагов");


    }
}
*/
    }
}