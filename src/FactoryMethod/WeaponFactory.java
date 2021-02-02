package FactoryMethod;

import Models.Weapons.Spear;
import Models.Weapons.Spell;
import Models.Weapons.Sword;
import Models.Weapons.Weapon;

public class WeaponFactory {
    public static Weapon getWeapon(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Spear")) {
            return new Spear();
        } else if (type.equalsIgnoreCase("Sword")) {
            return new Sword();
        } else if (type.equalsIgnoreCase("Spell")) {
            return new Spell();
        }
        return null;
    }
}
