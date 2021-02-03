package Models.Monsters;

import ExternalMethods.ExternalMethods;
import Models.Heroes.Hero;

public class Spider extends Monster {
    public Spider(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        int random = ExternalMethods.randomNumber(0, 1);

        if (random == 0) {
            hero.setHealth(hero.getHealth() - 5);
        } else if (random == 1) {
            hero.setHealth(hero.getHealth() - 8);
        }
    }

}
