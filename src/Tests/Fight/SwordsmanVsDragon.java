package Tests.Fight;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import ExternalMethods.ExternalMethods;
import FactoryMethod.HeroFactory;
import FactoryMethod.MonsterFactory;
import FactoryMethod.WeaponFactory;
import Models.Heroes.Hero;
import Models.Monsters.Monster;
import Models.Weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class SwordsmanVsDragon {
    public static void main(String[] args) throws PickUpException, FullInventoryException {
        List<Weapon> weapons = new ArrayList<>() {{
            add(WeaponFactory.getWeapon("Sword"));
            add(WeaponFactory.getWeapon("Spear"));
            add(WeaponFactory.getWeapon("Spell"));
            add(WeaponFactory.getWeapon("Spell"));
            add(WeaponFactory.getWeapon("Spear"));
        }};

        Hero wizard = HeroFactory.getHero("Wizard");

        wizard.getWeapon(weapons.get(3), weapons);

        Monster dragon = MonsterFactory.getMonster("Dragon", 100);

        ExternalMethods.fightSimulation(wizard, dragon);
    }
}
