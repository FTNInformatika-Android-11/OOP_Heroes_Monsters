package FactoryMethod;

import Models.Monsters.Dragon;
import Models.Monsters.Monster;
import Models.Monsters.Spider;

public class MonsterFactory {
    public static Monster getMonster(String type, int health) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Spider")) {
            return new Spider(health);
        } else if (type.equalsIgnoreCase("Dragon")) {
            return new Dragon(health);
        }
        return null;
    }
}
