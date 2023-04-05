import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    Hero hero = new Rascal("Ivan", 1, 5, 5);
    Hero hero2 = new Sniper("Valera", 2, 1, 2);
    Hero hero3 = new Rascal("Artur", 1, 1, 3);
    ArrayList<Hero> fighters = new ArrayList<>();
    fighters.add(hero);
    fighters.add(hero2);
    fighters.add(hero3);
    fighters.add(new Peasant("Oleg", 2, 0, 0));
    System.out.println(hero3.getInfo());
    hero2.step(fighters);
    System.out.println(hero3.getInfo());
  }
}