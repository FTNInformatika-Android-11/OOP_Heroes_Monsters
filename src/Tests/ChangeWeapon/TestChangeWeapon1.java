package Tests.ChangeWeapon;

import Exceptions.NoWeaponException;
import FactoryMethod.HeroFactory;
import Models.Heroes.Hero;

public class TestChangeWeapon1 {
    public static void main(String[] args) throws NoWeaponException {
        Hero swordsman = HeroFactory.getHero("Swordsman");

        swordsman.changeWeapon();
    }
}
