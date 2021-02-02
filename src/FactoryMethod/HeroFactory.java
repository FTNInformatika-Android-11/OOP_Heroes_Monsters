package FactoryMethod;

import Models.Heroes.Hero;
import Models.Heroes.Swordsman;
import Models.Heroes.Wizard;

public class HeroFactory {
    public static Hero getHero(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Wizard")) {
            return new Wizard();
        } else if (type.equalsIgnoreCase("Swordsman")) {
            return new Swordsman();
        }
        return null;
    }
}
