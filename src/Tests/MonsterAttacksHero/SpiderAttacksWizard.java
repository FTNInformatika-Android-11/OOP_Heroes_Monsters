package Tests.MonsterAttacksHero;

import FactoryMethod.HeroFactory;
import FactoryMethod.MonsterFactory;
import FactoryMethod.WeaponFactory;
import Models.Heroes.Hero;
import Models.Monsters.Monster;
import Models.Weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class SpiderAttacksWizard {

    public static void main(String[] args) {
        Hero wizard = HeroFactory.getHero("Wizard");

        Monster spider = MonsterFactory.getMonster("Spider", 100);

        spider.attackHero(wizard);
    }


}
