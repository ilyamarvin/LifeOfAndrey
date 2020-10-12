package AIDevelopers.Components;

import AIDevelopers.Entities.Andrey;

public class Stats {
    private float hp = 100, xp = 0, stamina = 50;

    private Andrey owner;

    public Stats(Andrey setOwner, int hp, int xp, int stamina) {
        this.hp = hp;
        this.xp = xp;
        this.stamina = stamina;
        this.owner = setOwner;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
        if (xp <= 0) {
            owner.EndOfHealth();
        }
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;

    }

    public float getStamina() {
        return stamina;
    }

    public void setStamina(float stamina) {
        this.stamina = stamina;
    }

    public Andrey getOwner() {
        return owner;
    }

    public void setOwner(Andrey owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "hp=" + hp +
                ", xp=" + xp +
                ", stamina=" + stamina +
                '}';
    }
}
