package Tests.HeroAttacksMonster;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import FactoryMethod.HeroFactory;
import FactoryMethod.MonsterFactory;
import FactoryMethod.WeaponFactory;
import Models.Heroes.Hero;
import Models.Monsters.Monster;
import Models.Weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class WizardAttacksSpider {
    public static void main(String[] args) throws PickUpException, FullInventoryException {
        List<Weapon> weapons = new ArrayList<>() {{
            add(WeaponFactory.getWeapon("Sword"));
            add(WeaponFactory.getWeapon("Sword"));
            add(WeaponFactory.getWeapon("Spell"));
            add(WeaponFactory.getWeapon("Spell"));
            add(WeaponFactory.getWeapon("Spear"));
        }};

        Hero wizard = HeroFactory.getHero("Wizard");
        Monster spider = MonsterFactory.getMonster("Spider",100);

        wizard.getWeapon(weapons.get(2),weapons);

        wizard.attackMonster(spider);
    }
}
