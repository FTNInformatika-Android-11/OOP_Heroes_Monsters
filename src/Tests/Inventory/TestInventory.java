package Tests.Inventory;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import Models.Heroes.Swordsman;
import Models.Weapons.Spear;
import Models.Weapons.Sword;

public class TestInventory {
    public static void main(String[] args) throws PickUpException, FullInventoryException {
        Swordsman swordsman = new Swordsman();
        Sword sword = new Sword();
        Spear spear = new Spear();

        swordsman.getWeapon(sword);
        swordsman.getWeapon(spear);
    }
}
