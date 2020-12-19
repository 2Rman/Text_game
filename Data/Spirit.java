import java.util.Random;

public class Spirit {

    private static Random randomizer = new Random();


    public static void firstWords() {
        System.out.println("\"Здравствуй, друг! Я - твой хранитель сна... Ты спишь, но, к сожалению, сам проснуться не сможешь.");
        System.out.println("Ты попал в необычный сон... Это - \"Сонный лабиринт\" и тебе нужно выбраться из него!");
        System.out.println("Выбраться живым! Иначе мы будем обречены вместе с тобой скитаться здесь вечно!...");
        System.out.println("Только напомни мне как тебя зовут! Ты же не думаешь, что ты первый у меня?\"");
        System.out.println("-Введите никнейм-");

    }

    public static void secondWords(String nickName, int playerHealth) {
        System.out.println("\"Точно! Ну что ж, " + nickName + ", давай я объясню что тут к чему.");
        System.out.println("Так как это сон, твои действия крайне ограничены. Делать ты можешь не много, но этого хватит, чтобы выжить.");
        System.out.println("1. Ты можешь \"идти\", что уже хорошо.");
        System.out.println("2. Ты можешь \"добыть\" рядом стоящие блоки, что поможет тебе в дальнейшем, не сомневайся.");
        System.out.println("3. Ты можешь \"поставить\" блок перед собой, что может даже спасет тебе жизнь когда-нибудь.");
        System.out.println("4. Ты можешь \"есть\" еду, которая у тебя в кармане. Пояснять почему это хорошо не вижу смысла.");
        System.out.println("5. Ты можешь бить словом, просто сказав \"атака\"! Надеюсь, ты понимаешь, что мы здесь не одни.");
        System.out.println("6. Ты можешь спросить меня \"как\" спастись, чтобы я тебе напомнил все, что только что сказал.");
        System.out.println("Вижу, что ты в полном здравии! Твое здоровье заполнено на " + playerHealth + "! Это прекрасно!");
        System.out.println("\nИтак, с чего начнем?..");
    }

    public static void how() {
        System.out.println("1. \"идти\" - движемся.");
        System.out.println("2. \"добыть\" - выкопать блок.");
        System.out.println("3. \"поставить\" - установить блок, если есть в инвентаре.");
        System.out.println("4. \"есть\" - повысить уровень здоровья, если есть припасы.");
        System.out.println("5. \"атака\" - атаковать противника.");
        System.out.println("6. \"как\" - вывести доступные действия.");
    }

    public static void gameCases(String playerCase, Player player) {
        switch (playerCase) {
            case "идти" -> {
                player.goForward();
                System.out.println("Продвигаемся вперед");
            }
            case "добыть" -> {
                player.digBlock();
                System.out.println("Выкапываем блок. Блоков в кармане: " + player.getPlayerBlocks());
            }
            case "поставить" -> {
                player.installBlock();
                System.out.println("Ставим блок. Блоков осталось: " + player.getPlayerBlocks());
            }
            case "есть" -> {
                if (!Food.sweetsArray.isEmpty()) {
                    int food = randomizer.nextInt(Food.sweetsArray.size());
                    player.feed(Food.sweetsArray.get(food));
                    System.out.println("Ты съел " + Food.sweetsArray.get(food).getName() + " и восстановил здоровье на "
                            + Food.sweetsArray.get(food).getHealFactor() + ". Теперь у тебя " + player.getHealth() +
                            " очков здоровья!");
                } else {
                    System.out.println("У тебя пока нечего кушать!");
                }
            }
            case "атака" -> {
                int randomVictim = randomizer.nextInt(Mob.mobArray.size());
                System.out.println("Битва между " + player.getName() + " и " + (Mob.mobArray.get(randomVictim).getName()));
                player.attack(Mob.mobArray.get(randomVictim));
                if (player.getIsAlive()) {
                    System.out.println("Ты победил врага и получил " + Mob.mobArray.get(randomVictim).getExpToPlayer() + " опыта!");
                } else {
                    System.out.println("Ты умер! Как так то?");
                }
            }
        }
    }
}




