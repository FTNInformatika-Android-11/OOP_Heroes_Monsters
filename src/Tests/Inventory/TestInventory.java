package Tests.Inventory;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import FactoryMethod.HeroFactory;
import FactoryMethod.WeaponFactory;
import Models.Heroes.Hero;
import Models.Weapons.Weapon;

public class TestInventory {
    public static void main(String[] args) throws PickUpException, FullInventoryException {
        Hero swordsman = HeroFactory.getHero("Swordsman");
        Weapon sword = WeaponFactory.getWeapon("Sword");
        Weapon spear = WeaponFactory.getWeapon("Spear");

        swordsman.getWeapon(sword);
        swordsman.getWeapon(spear);
    }
}
