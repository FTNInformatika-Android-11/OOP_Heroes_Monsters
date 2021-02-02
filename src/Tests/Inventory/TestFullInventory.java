package Tests.Inventory;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import FactoryMethod.HeroFactory;
import FactoryMethod.WeaponFactory;
import Models.Heroes.Hero;
import Models.Weapons.Weapon;

public class TestFullInventory {
    public static void main(String[] args) throws PickUpException, FullInventoryException {
        Hero swordsman = HeroFactory.getHero("Swordsman");
        Weapon sword = WeaponFactory.getWeapon("Sword");
        Weapon spear1 = WeaponFactory.getWeapon("Spear");
        Weapon spear2 = WeaponFactory.getWeapon("Spear");

        swordsman.getWeapon(sword);
        swordsman.getWeapon(spear1);
        swordsman.getWeapon(spear2);
    }
}
