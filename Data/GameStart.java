import Player.Player;

import java.util.Scanner;

public class GameStart {

    public static void main(String[] args) {

        String action;

        System.out.println("\"Привет, друг! Я - твой хранитель сна... Ты спишь, но, к сожалению, сам проснуться не сможешь.");
        System.out.println("Ты попал в необычный сон... Это - \"Сонный лабиринт\" и тебе нужно выбраться из него!");
        System.out.println("Выбраться живым! Иначе мы будем обречены вместе с тобой скитаться здесь вечно!...");
        System.out.println("Только напомни мне как тебя зовут! Ты же не думаешь, что ты первый у меня?\"");
        System.out.println("Введите никнейм");

        Scanner texter = new Scanner(System.in);
        String newbie = texter.nextLine();

        Player player1 = new Player(newbie, 100);

        System.out.println("\"Точно! Ну что ж, " + player1.getPlayerName() + ", давай я объясню что тут к чему.");
        System.out.println("Так как это сон, твои действия крайне ограничены. Делать ты можешь не много, но этого хватит, чтобы выжить.");
        System.out.println("1. Ты можешь \"идти\", что уже хорошо.");
        System.out.println("2. Ты можешь \"добыть\" рядом стоящие блоки, что поможет тебе в дальнейшем, не сомневайся.");
        System.out.println("3. Ты можешь \"поставить\" блок перед собой, что может даже спасет тебе жизнь когда-нибудь.");
        System.out.println("4. Ты можешь \"есть\" еду, которая у тебя в кармане. Пояснять почему это хорошо не вижу смысла.");
        System.out.println("5. Ты можешь бить словом, просто сказав \"атака\"! Надеюсь, ты понимаешь, что мы здесь не одни.");
        System.out.println("6. Ты можешь \"взять\" предмет, который может выпасть из твоих врагов! Это даст тебе преимущество в виде оружия или еды.");
        System.out.println("7. Ты можешь спросить меня \"как\" спастись, чтобы я тебе напомнил все, что только что сказал.");
        System.out.println("Вижу, что ты в полном здравии! Твое здоровье заполнено на " + player1.getPlayerHealth() + "! Это прекрасно!");
        System.out.println("\nИтак, с чего начнем?..");



        do {
            action = texter.nextLine();
            switch (action){
                case "идти":
                    Player.move();
                    break;
                case "добыть":
                    Player.mine();
                    break;
                case "поставить":
                    Player.install();
                    break;
            /*  case "есть":
                case "атака":
                case "взять":*/
                case "как":
                    Player.how();
                    break;
            }

        } while (player1.getStepCount() < 4);

        System.out.println("\nТы благополучно выбрался из \"Сонного лабиринта\"! Мои поздравления, " + player1.getPlayerName() + "!!!");


    }
}
