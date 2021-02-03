package ExternalMethods;

import Models.Heroes.Hero;
import Models.Monsters.Monster;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExternalMethods {
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void fightSimulation(Hero hero, Monster monster) {
        do {
            int random = ExternalMethods.randomNumber(0, 100);

            if (random < 50 && random >= 0) {
                hero.attackMonster(monster);
                logWriter(hero.getClass().getSimpleName() + " attacked " + monster.getClass().getSimpleName() + " using " + hero.getWeapon().getClass().getSimpleName() + "\n");
            } else if (random >= 50 && random <= 100) {
                monster.attackHero(hero);
                logWriter(monster.getClass().getSimpleName() + " attacked " + hero.getClass().getSimpleName() + " using " + monster.getAttackType() + "\n");
            }

            if (hero.getHealth() <= 0) {
                System.out.println("Winner is " + monster.getClass().getSimpleName());
                logWriter(monster.getClass().getSimpleName() + " wins in duel with " + hero.getClass().getSimpleName() + "\n\n\n");
                break;
            }
            if (monster.getHealth() <= 0) {
                System.out.println("Winner is " + hero.getClass().getSimpleName());
                logWriter(hero.getClass().getSimpleName() + " wins in duel with " + monster.getClass().getSimpleName() + "\n\n\n");

                break;
            }

        } while (hero.getHealth() > 0 || monster.getHealth() > 0);
    }

    public static void logWriter(String logLine) {
        try {
            File file = new File("log.txt");
            if (file.createNewFile())
                System.out.println("file.txt File Created in Project root directory");

            Files.write(Paths.get("log.txt"), (logLine).getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
