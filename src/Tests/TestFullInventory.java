package Tests;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import Models.Heroes.Swordsman;
import Models.Weapons.Spear;
import Models.Weapons.Sword;

public class TestFullInventory {
    public static void main(String[] args) throws PickUpException, FullInventoryException {
        Swordsman swordsman = new Swordsman();
        Sword sword = new Sword();
        Spear spear1 = new Spear();
        Spear spear2 = new Spear();

        swordsman.getWeapon(sword);
        swordsman.getWeapon(spear1);
        swordsman.getWeapon(spear2);
    }
}
