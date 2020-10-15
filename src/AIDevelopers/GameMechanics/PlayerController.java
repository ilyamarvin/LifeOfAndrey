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
        System.out.println("Время 7:00");
        System.out.println("Что делать сегодня?");
        System.out.println("1. Идти в ВУЗ");
        System.out.println("2. Остаться дома");
        System.out.println("3. Вскрыться");
        int choose;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                goToMirea();
                break;
            case 2:
                stayHome();
                break;
            case 3:
                killYourself();
                break;
        }
    }

    private void goToMirea() {
        controlledAndrei.getStats().setXp(controlledAndrei.getStats().getXp() + 50);
        controlledAndrei.getStats().setStamina(controlledAndrei.getStats().getStamina() - 25);
        System.out.println("Ваш Андрей сходил в ВУЗ и поумнел! Но при этом устал!");
        System.out.println(controlledAndrei.getStats());
        daysLived++;

    }

    private void stayHome() {
        System.out.println("Вы решили остаться дома");
        System.out.println("Чем же вы займетесь дома?");
        System.out.println("1. Занимаемся проектом");
        System.out.println("2. Чиллим");

        int choose;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                doProject();
                break;
            case 2:
                chill();
                break;

        }

        daysLived++;
    }

    private void doProject() {
        System.out.println("Вы занялись проектом...");
        controlledAndrei.getStats().setXp(controlledAndrei.getStats().getXp() + 200);
        controlledAndrei.getStats().setStamina(controlledAndrei.getStats().getStamina() - 50);
        System.out.println("Ваш Андрей прозанимался проектом весь день!");
        System.out.println(controlledAndrei.getStats());
        daysLived++;

    }

    private void chill() {
        System.out.println("Вы решили почиллить в этот день...");
        controlledAndrei.getStats().setStamina(controlledAndrei.getStats().getStamina() - 50);
        System.out.println("Ваш Андрей прозанимался проектом весь день!");
        System.out.println(controlledAndrei.getStats());
        daysLived++;

    }

    private void killYourself() {
        System.out.println("Вы решили покончить с жизнью.");
        controlledAndrei.ApplyDamage(controlledAndrei, 100);
        System.out.println("Дней прожито: "+daysLived);
    }
}


