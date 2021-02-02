package Models.Heroes;

import Exceptions.PickUpException;
import Models.Weapons.Spear;
import Models.Weapons.Spell;
import Models.Weapons.Sword;
import Models.Weapons.Weapon;

public class Wizard extends Hero {
    private Weapon weapon;

    public Wizard() {
        super(150);
    }

    @Override
    public void getWeapon(Weapon weapon) throws PickUpException {
        if (weapon instanceof Sword || weapon instanceof Spear) {
            throw new PickUpException("Wizard can't pickup this weapon");
        } else if (weapon instanceof Spell) {
            this.weapon = weapon;
            System.out.println(weapon.getClass().getSimpleName() + " added to inventory");
        }
    }

    @Override
    public void dropWeapon(Weapon weapon) {

    }
}
