package AIDevelopers.Components;

import AIDevelopers.Entities.Andrey;

public class Stats {
    private float hp = 100, xp = 0, stamina = 50;
    private int level;

    private Andrey owner;

    public Stats(Andrey setOwner, int hp, int xp, int stamina, int level) {
        this.owner = setOwner;
        this.hp = hp;
        this.xp = xp;
        this.stamina = stamina;
        this.level = level;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
        if (hp <= 0) {
            owner.EndOfHealth();
        }
        if (hp > 100) {
            hp = 100;
        }
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
        float counterXP = getXp() / 100;

        if (counterXP >= 1) {
            setLevel(getLevel()+1);
            setXp(getXp()-100);
        }

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "hp=" + hp +
                ", xp=" + xp +
                ", stamina=" + stamina +
                ", level=" + level +
                '}';
    }
}
