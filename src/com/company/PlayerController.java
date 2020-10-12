package com.company;

import com.company.Entities.Andrey;

import java.util.Scanner;

public class PlayerController {
    int CurrentState;
    private Andrey controlledAndrei;
    private GameState gameState;

    public PlayerController(Andrey controlled) {
       controlledAndrei = controlled;
    }

    public int getCurrentState() {
        return CurrentState;
    }

    public void setCurrentState(int currentState) {
        CurrentState = currentState;
    }

    public Andrey getControlledAndrei() {
        return controlledAndrei;
    }

    public void setControlledAndrei(Andrey controlledAndrei) {
        this.controlledAndrei = controlledAndrei;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
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
        controlledAndrei.getStats().setXp(controlledAndrei.getStats().getXp()+100);
        controlledAndrei.getStats().setStamina(controlledAndrei.getStats().getStamina()-25);
        System.out.println("Ваш Андрей сходил в ВУЗ и поумнел! Но при этом устал!");
        System.out.println(controlledAndrei.getStats());

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


