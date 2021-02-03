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

public class GetDroppedWeapon {
    public static void main(String[] args) throws PickUpException, FullInventoryException, NoWeaponException {
        List<Weapon> weapons = new ArrayList<>() {{
            add(WeaponFactory.getWeapon("Sword"));
            add(WeaponFactory.getWeapon("Spear"));
            add(WeaponFactory.getWeapon("Spell"));
            add(WeaponFactory.getWeapon("Spell"));
            add(WeaponFactory.getWeapon("Spear"));
        }};

        Hero swordsman = HeroFactory.getHero("Swordsman");
        Hero swordsman2 = HeroFactory.getHero("Swordsman");

        swordsman.getWeapon(weapons.get(0), weapons);
        swordsman.dropWeapon(weapons);

        swordsman2.getWeapon(weapons.get(weapons.size() - 1), weapons);
    }
}
