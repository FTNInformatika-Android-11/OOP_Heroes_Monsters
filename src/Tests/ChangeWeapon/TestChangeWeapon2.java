package Tests.ChangeWeapon;

import Exceptions.FullInventoryException;
import Exceptions.NoWeaponException;
import Exceptions.PickUpException;
import FactoryMethod.HeroFactory;
import FactoryMethod.WeaponFactory;
import Models.Heroes.Hero;
import Models.Weapons.Weapon;

public class TestChangeWeapon2 {
    public static void main(String[] args) throws PickUpException, FullInventoryException, NoWeaponException {
        Hero swordsman = HeroFactory.getHero("Swordsman");
        Weapon sword = WeaponFactory.getWeapon("Sword");

        swordsman.getWeapon(sword);

        swordsman.changeWeapon();
    }
}
