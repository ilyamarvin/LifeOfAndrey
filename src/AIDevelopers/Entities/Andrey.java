package AIDevelopers.Entities;

import AIDevelopers.Components.Stats;
import AIDevelopers.GameMechanics.GameState;
import AIDevelopers.GameMechanics.PlayerController;
import AIDevelopers.Interfaces.DamageInterface;

public class Andrey extends BaseEntity {
    final private String NAME = "Andrey";
    private int age;
    private Stats stats;
    private PlayerController controller;

    @Override
    public void EndOfHealth() {
        System.out.println("ВАШ АНДРЕЙ ЗДОХ");
        controller.getGameState().setEnd(true);
    }


    public Andrey(GameState gameState) {
        stats  = new Stats(this,100, 0, 50);
        controller = new PlayerController(this);
        controller.setGameState(gameState);
    }

    public Andrey(int age) {
        this.age = age;
    }

    public String getNAME() {
        return NAME;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public PlayerController getController() {
        return controller;
    }

    public void setController(PlayerController controller) {
        this.controller = controller;
    }

    @Override
    public void ApplyDamage(Andrey damagedAndrey, float DamageToApply) {
        stats.setHp(stats.getHp()-DamageToApply);
    }
}
