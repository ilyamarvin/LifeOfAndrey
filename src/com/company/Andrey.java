package com.company;

public class Andrey implements Damage{
    final private String NAME = "Andrey";
    private int age;
    Stats stats;
    PlayerController controller;

    public void EndOfHealth() {
        System.out.println("ВАШ АНДРЕЙ ЗДОХ");
        controller.gameState.setEnd(true);
    }


    public Andrey(GameState gameState) {
        stats  = new Stats(this,100, 0, 50);
        controller = new PlayerController(this);
        controller.gameState = gameState;
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

    @Override
    public void ApplyDamage(Andrey damagedAndrey, int DamageToApply) {
        stats.setHp(stats.getHp()-DamageToApply);
    }
}
