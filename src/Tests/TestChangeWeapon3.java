package Tests;

import Exceptions.FullInventoryException;
import Exceptions.NoWeaponException;
import Exceptions.PickUpException;
import Models.Heroes.Swordsman;
import Models.Weapons.Spear;
import Models.Weapons.Sword;

public class TestChangeWeapon3 {
    public static void main(String[] args) throws PickUpException, FullInventoryException, NoWeaponException {
        Swordsman swordsman = new Swordsman();
        Sword sword = new Sword();
        Spear spear1 = new Spear();

        swordsman.getWeapon(sword);
        swordsman.getWeapon(spear1);

        swordsman.changeWeapon();
        swordsman.changeWeapon();
        swordsman.changeWeapon();
    }
}
