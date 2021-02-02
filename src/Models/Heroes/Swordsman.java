package Models.Heroes;

import Exceptions.PickUpException;
import Models.Weapons.Spear;
import Models.Weapons.Spell;
import Models.Weapons.Sword;
import Models.Weapons.Weapon;

public class Swordsman extends Hero {
    private Weapon weapon;

    public Swordsman() {
        super(100);
    }

    @Override
    public void getWeapon(Weapon weapon) throws PickUpException {
        if (weapon instanceof Spell) {
            throw new PickUpException("Swordsman can't pickup this weapon");
        } else if (weapon instanceof Sword || weapon instanceof Spear) {
            this.weapon = weapon;
            System.out.println(weapon.getClass().getSimpleName() + " added to inventory");
        }
    }

    @Override
    public void dropWeapon(Weapon weapon) {

    }
}
