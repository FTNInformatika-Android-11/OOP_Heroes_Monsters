package Tests;

import Exceptions.FullInventoryException;
import Exceptions.PickUpException;
import Models.Heroes.Wizard;
import Models.Weapons.Sword;

public class TestWizardSword {

    public static void main(String[] args) throws PickUpException, FullInventoryException {
        Wizard wizard = new Wizard();
        Sword sword = new Sword();

        wizard.getWeapon(sword);
    }
}
