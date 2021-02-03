package ExternalMethods;

import Models.Heroes.Hero;
import Models.Monsters.Monster;

public class ExternalMethods {
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void fightSimulation(Hero hero, Monster monster) {
        do {
            int random = ExternalMethods.randomNumber(0, 100);

            if (random < 50 && random >= 0) {
                hero.attackMonster(monster);
            } else if (random >= 50 && random <= 100) {
                monster.attackHero(hero);
            }

            if (hero.getHealth() <= 0) {
                System.out.println("Winner is " + monster.getClass().getSimpleName());
                break;
            }
            if (monster.getHealth() <= 0) {
                System.out.println("Winner is " + hero.getClass().getSimpleName());
                break;
            }

        } while (hero.getHealth() > 0 || monster.getHealth() > 0);
    }
}
