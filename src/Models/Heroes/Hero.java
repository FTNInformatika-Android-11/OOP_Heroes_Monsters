package Models.Heroes;

import Exceptions.PickUpException;
import Models.Weapons.Weapon;

abstract class Hero {
    private int health;

    public abstract void getWeapon(Weapon weapon) throws PickUpException;

    public abstract void dropWeapon(Weapon weapon);

    public Hero(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
