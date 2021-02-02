package Tests.ChangeWeapon;

import Exceptions.FullInventoryException;
import Exceptions.NoWeaponException;
import Exceptions.PickUpException;
import FactoryMethod.HeroFactory;
import FactoryMethod.WeaponFactory;
import Models.Heroes.Hero;
import Models.Weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class TestChangeWeapon3 {
    public static void main(String[] args) throws PickUpException, FullInventoryException, NoWeaponException {
        List<Weapon> weapons = new ArrayList<>() {{
            add(WeaponFactory.getWeapon("Sword"));
            add(WeaponFactory.getWeapon("Spear"));
            add(WeaponFactory.getWeapon("Spell"));
            add(WeaponFactory.getWeapon("Spell"));
            add(WeaponFactory.getWeapon("Spear"));
        }};

        Hero swordsman = HeroFactory.getHero("Swordsman");

        swordsman.getWeapon(weapons.get(0), weapons);
        swordsman.getWeapon(weapons.get(0), weapons);

        swordsman.changeWeapon();
        swordsman.changeWeapon();
        swordsman.changeWeapon();
    }
}
