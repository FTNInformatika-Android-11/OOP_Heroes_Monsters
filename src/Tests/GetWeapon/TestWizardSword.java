package Tests.GetWeapon;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import FactoryMethod.HeroFactory;
import FactoryMethod.WeaponFactory;
import Models.Heroes.Hero;
import Models.Weapons.Weapon;

public class TestWizardSword {

    public static void main(String[] args) throws PickUpException, FullInventoryException {
        Hero wizard = HeroFactory.getHero("Wizard");
        Weapon sword = WeaponFactory.getWeapon("Sword");

        wizard.getWeapon(sword);
    }
}
