package Tests.ChangeWeapon;

import Exceptions.FullInventoryException;
import Exceptions.NoWeaponException;
import Exceptions.PickUpException;
import FactoryMethod.HeroFactory;
import FactoryMethod.WeaponFactory;
import Models.Heroes.Hero;
import Models.Weapons.Weapon;

public class TestChangeWeapon3 {
    public static void main(String[] args) throws PickUpException, FullInventoryException, NoWeaponException {
        Hero swordsman = HeroFactory.getHero("Swordsman");
        Weapon sword = WeaponFactory.getWeapon("Sword");
        Weapon spear1 = WeaponFactory.getWeapon("Spear");

        swordsman.getWeapon(sword);
        swordsman.getWeapon(spear1);

        swordsman.changeWeapon();
        swordsman.changeWeapon();
        swordsman.changeWeapon();
    }
}
