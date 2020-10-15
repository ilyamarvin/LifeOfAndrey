package AIDevelopers;

import AIDevelopers.GameMechanics.GameState;
import AIDevelopers.Entities.Andrey;

import java.util.Scanner;

public class Main {
    private static GameState game = new GameState();
    private static int choose;
    static Scanner scanner = new Scanner(System.in);

    private static Andrey andrey = new Andrey(game);

    public static void main(String[] args) {
        gameStart();
    }

    public static void gameStart() {
        System.out.println("Привет! Это игра про жизнь Андрея!");
        System.out.println("Сколько нашему Андрею лет?");
        andrey.setAge(scanner.nextInt());
        System.out.println("Возраст Андрюшки: " + andrey.getAge());
        System.out.println("Ваш Андрей идиот?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        choose = scanner.nextInt();
        if (choose == 1) {
            System.out.println("Ваш Андрей - идиот");
        } else if (choose == 2) {
            System.out.println("Вы уверены? Андреев не идиотов не бывает!");
            System.out.println("Ваш Андрей - идиот");

        } else {
            System.out.println("Вы ввели неправильное число!");
        }
        System.out.println("Цель игры - сделать из Андрея нормального человека!");


        while (!game.isEnd()) {
            andrey.getController().DoCommand();
        }
        if (game.isEnd()) {
            gameRestart();
        }
    }
    public static void gameRestart() {
        System.out.println("Хотите попробовать сначала?");
        choose = 0;
        System.out.println("1. Да");
        System.out.println("2. Нет");
        choose = scanner.nextInt();
        if (choose == 1) {
            game.setEnd(false);
            gameStart();
        } else if (choose == 2) {
            System.out.println("Пока :(");
            game.isEnd();
        } else {
            System.out.println("Вы ввели число неправильно");
        }
    }
}
