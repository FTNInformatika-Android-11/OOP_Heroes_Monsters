package Models.Heroes;

import Exceptions.FullInventoryException;
import Exceptions.NoWeaponException;
import Exceptions.PickUpException;
import Models.Weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

abstract class Hero {
    private int health;

    protected Weapon weapon;
    protected List<Weapon> inventory = new ArrayList<>();
    protected int position = 0;

    public abstract void getWeapon(Weapon weapon) throws PickUpException, FullInventoryException;

    public abstract void dropWeapon(Weapon weapon);

    public void changeWeapon() throws NoWeaponException {
        switch (inventory.size()) {
            case 0:
                throw new NoWeaponException("Inventory is Empty");
            case 1:
                System.out.println("You have only one weapon");
                break;
            case 2:
                if (position == 0) {
                    weapon = inventory.get(++position);
                    System.out.println("Weapon changed to " + weapon.getClass().getSimpleName());
                } else if (position == 1) {
                    weapon = inventory.get(--position);
                    System.out.println("Weapon changed to " + weapon.getClass().getSimpleName());
                }
                break;
        }
    }

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
