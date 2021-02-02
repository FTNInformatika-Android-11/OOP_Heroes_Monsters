package Tests;

import Exceptions.NoWeaponException;
import Models.Heroes.Swordsman;

public class TestChangeWeapon1 {
    public static void main(String[] args) throws NoWeaponException {
        Swordsman swordsman = new Swordsman();

        swordsman.changeWeapon();
    }
}
