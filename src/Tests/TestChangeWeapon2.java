package Tests;

import Exceptions.FullInventoryException;
import Exceptions.NoWeaponException;
import Exceptions.PickUpException;
import Models.Heroes.Swordsman;
import Models.Weapons.Spear;
import Models.Weapons.Sword;

public class TestChangeWeapon2 {
    public static void main(String[] args) throws PickUpException, FullInventoryException, NoWeaponException {
        Swordsman swordsman = new Swordsman();
        Sword sword = new Sword();

        swordsman.getWeapon(sword);

        swordsman.changeWeapon();
    }
}
