package com.company;

import java.util.Scanner;

public class PlayerController {
    int CurrentState;
    Andrey controlledAndrei;
    GameState gameState;

    public PlayerController(Andrey controlled) {
       controlledAndrei = controlled;
    }

    public void DoCommand() {
        System.out.println("Что делаем сегодня?");
        System.out.println("1. Идём в ВУЗ");
        System.out.println("2. Остаться дома");
        System.out.println("3. Занимаемся проектом");
        System.out.println("4. Чиллим");
        System.out.println("5. Вскрыться");
        int choose;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                GoToMirea();
                break;
            case 2:
                StayHome();
                break;
            case 3:
                DoProject();
                break;
            case 4:
                Chill();
                break;
            case 5:
                ROSKOMNADZOR();
                break;
        }
    }

    private void GoToMirea() {
        controlledAndrei.stats.setXp(controlledAndrei.stats.getXp()+100);
        controlledAndrei.stats.setStamina(controlledAndrei.stats.getStamina()-25);
        System.out.println("Ваш Андрей сходил в ВУЗ и поумнел! Но при этом устал!");
        System.out.println(controlledAndrei.stats);

    }

    private void StayHome() {

    }

    private void DoProject() {

    }

    private void Chill() {

    }

    private void ROSKOMNADZOR() {
        controlledAndrei.ApplyDamage(controlledAndrei, 100);
    }
}
