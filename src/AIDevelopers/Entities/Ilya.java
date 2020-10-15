package AIDevelopers.Entities;

import AIDevelopers.Components.Stats;

public class Ilya extends BaseEntity {
    final private String NAME = "Ilya";
    private int age;
    private Stats stats;

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
}
