package com.company;

import com.company.Entities.Andrey;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameState game = new GameState();
        int choose;
        Scanner scanner = new Scanner(System.in);

        Andrey andrey = new Andrey(game);

        while (!game.isEnd()) {
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

            andrey.getController().DoCommand();

        }


    }
}
