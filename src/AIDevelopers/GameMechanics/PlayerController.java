package AIDevelopers.GameMechanics;

import AIDevelopers.Entities.Andrey;

import java.util.Scanner;

public class PlayerController {
    int CurrentState;
    private int daysLived = 0;
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
        System.out.println("////////////////////////////////////////////////");
        daysLived = 1;
        System.out.println("День " + daysLived);
        System.out.println("Что делать сегодня?");
        System.out.println("1. Идти в ВУЗ");
        System.out.println("2. Остаться дома");
        System.out.println("3. Заняться проектом");
        System.out.println("4. Чиллить");
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
            case 5:
                ROSKOMNADZOR();
                break;
        }
    }

    private void GoToMirea() {
        controlledAndrei.getStats().setXp(controlledAndrei.getStats().getXp() + 100);
        controlledAndrei.getStats().setStamina(controlledAndrei.getStats().getStamina() - 25);
        System.out.println("Ваш Андрей сходил в ВУЗ и поумнел! Но при этом устал!");
        System.out.println(controlledAndrei.getStats());
        daysLived++;

    }

    private void StayHome() {
        daysLived++;

    }

    private void DoProject() {
        daysLived++;

    }

    private void Chill() {
        daysLived++;

    }

    private void ROSKOMNADZOR() {
        controlledAndrei.ApplyDamage(controlledAndrei, 100);
        System.out.println("Дней прожито: "+daysLived);
    }
}


