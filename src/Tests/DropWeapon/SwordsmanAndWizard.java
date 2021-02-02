package Tests.DropWeapon;

import Exceptions.FullInventoryException;
import Exceptions.NoWeaponException;
import Exceptions.PickUpException;
import FactoryMethod.HeroFactory;
import FactoryMethod.WeaponFactory;
import Models.Heroes.Hero;
import Models.Weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class SwordsmanAndWizard {
    private static List<Weapon> weapons = new ArrayList<>() {{
        add(WeaponFactory.getWeapon("Sword"));
        add(WeaponFactory.getWeapon("Spear"));
        add(WeaponFactory.getWeapon("Spell"));
        add(WeaponFactory.getWeapon("Spell"));
        add(WeaponFactory.getWeapon("Spear"));
    }};

    public static void main(String[] args) throws NoWeaponException, PickUpException, FullInventoryException {
        Hero swordsman = HeroFactory.getHero("Swordsman");

        Hero wizard = HeroFactory.getHero("Wizard");

        swordsman.getWeapon(weapons.get(0), weapons);
        swordsman.getWeapon(weapons.get(0), weapons);

        wizard.getWeapon(weapons.get(0), weapons);

        swordsman.changeWeapon();


    }
}
