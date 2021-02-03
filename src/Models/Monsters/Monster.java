package Models.Monsters;

import Models.Heroes.Hero;

public abstract class Monster {
    private int health;

    private String attackType;

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public abstract void attackHero(Hero hero);

    public Monster(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
