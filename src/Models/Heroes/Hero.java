package Models.Heroes;

import Exceptions.PickUpException;
import Models.Weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

abstract class Hero {
    private int health;

    protected Weapon weapon;
    protected List<Weapon> inventory = new ArrayList<>();

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
