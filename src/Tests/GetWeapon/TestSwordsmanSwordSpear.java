package Tests.GetWeapon;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import FactoryMethod.HeroFactory;
import FactoryMethod.WeaponFactory;
import Models.Heroes.Hero;
import Models.Weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class TestSwordsmanSwordSpear {
    private static List<Weapon> weapons = new ArrayList<>() {{
        add(WeaponFactory.getWeapon("Sword"));
        add(WeaponFactory.getWeapon("Spear"));
        add(WeaponFactory.getWeapon("Spell"));
        add(WeaponFactory.getWeapon("Spell"));
        add(WeaponFactory.getWeapon("Spear"));
    }};

    public static void main(String[] args) throws PickUpException, FullInventoryException {
        Hero swordsman = HeroFactory.getHero("Swordsman");

        swordsman.getWeapon(weapons.get(0),weapons);
        swordsman.getWeapon(weapons.get(0),weapons);
    }
}
