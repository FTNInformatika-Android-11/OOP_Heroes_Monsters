package Models.Heroes;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import Models.Weapons.Spear;
import Models.Weapons.Spell;
import Models.Weapons.Sword;
import Models.Weapons.Weapon;

import java.util.List;

public class Swordsman extends Hero {
    public Swordsman() {
        super(100);
    }

    @Override
    public void getWeapon(Weapon weapon, List<Weapon> weapons) throws PickUpException, FullInventoryException {
        if (weapon instanceof Spell) {
            throw new PickUpException("Swordsman can't pickup " + weapon.getClass().getSimpleName());
        } else if (weapon instanceof Sword || weapon instanceof Spear) {
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