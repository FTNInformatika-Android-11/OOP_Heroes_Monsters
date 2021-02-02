package Tests;

import Exceptions.PickUpException;
import Models.Heroes.Swordsman;
import Models.Weapons.Spear;
import Models.Weapons.Sword;

public class TestSwordsmanSwordSpear {
    public static void main(String[] args) throws PickUpException {
        Swordsman swordsman = new Swordsman();
        Sword sword = new Sword();
        Spear spear = new Spear();

        swordsman.getWeapon(sword);
        swordsman.getWeapon(spear);
    }
}
