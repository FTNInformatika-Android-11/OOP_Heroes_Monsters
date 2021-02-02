package Models.Heroes;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import Models.Weapons.Spear;
import Models.Weapons.Spell;
import Models.Weapons.Sword;
import Models.Weapons.Weapon;

public class Wizard extends Hero {
    public Wizard() {
        super(150);
    }

    @Override
    public void getWeapon(Weapon weapon) throws PickUpException, FullInventoryException {
        if (weapon instanceof Sword || weapon instanceof Spear) {
            throw new PickUpException("Wizard can't pickup this weapon");
        } else if (weapon instanceof Spell) {
            if (inventory.size() == 0) {
                super.weapon = weapon;
                inventory.add(weapon);
                System.out.println(weapon.getClass().getSimpleName() + " added to inventory");
            } else if (inventory.size() == 1) {
                inventory.add(weapon);
                System.out.println(weapon.getClass().getSimpleName() + " added to inventory");
            } else {
                throw new FullInventoryException("Inventory is full");
            }
        }
    }

    @Override
    public void dropWeapon(Weapon weapon) {

    }
}
