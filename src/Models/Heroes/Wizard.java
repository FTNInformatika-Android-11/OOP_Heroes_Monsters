package Models.Heroes;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import Models.Weapons.Spear;
import Models.Weapons.Spell;
import Models.Weapons.Sword;
import Models.Weapons.Weapon;

import java.util.List;

public class Wizard extends Hero {
    public Wizard() {
        super(150);
    }

    @Override
    public void getWeapon(Weapon weapon, List<Weapon> weapons) throws PickUpException, FullInventoryException {
        if (weapon instanceof Sword || weapon instanceof Spear) {
            throw new PickUpException("Wizard can't pickup " + weapon.getClass().getSimpleName());
        } else if (weapon instanceof Spell) {
            if (inventory.size() == 0) {
                super.weapon = weapon;
                inventory.add(weapon);
                weapons.remove(weapon);
                System.out.println(weapon.getClass().getSimpleName() + " added to inventory");
            } else if (inventory.size() == 1) {
                inventory.add(weapon);
                weapons.remove(weapon);
                System.out.println(weapon.getClass().getSimpleName() + " added to inventory");
            } else {
                throw new FullInventoryException("Inventory is full");
            }
        }
    }
}