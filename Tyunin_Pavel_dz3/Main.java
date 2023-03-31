
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    ArrayList<Hero> team1 = new ArrayList<>();
    for (int i = 0; i < 10; i++){
      switch (new Random().nextInt(4)){
        case 0:
          team1.add(new Peasant("Oleg", 1));
          break;
        case 1:
          team1.add(new Rascal("Artem", 1));
          break;
        case 2:
          team1.add(new Sniper("Ivan", 1));
          break;
        default:
          team1.add(new Wizard("Pete", 1));
          break;
      }
    }
    //Collections.sort(team1);
    ArrayList<Hero> team2 = new ArrayList<>();
    for (int i = 0; i < 10; i++){
      switch (new Random().nextInt(4)){
        case 0:
          team2.add(new Peasant("Artur", 2));
          break;
        case 1:
          team2.add(new Spearman("Danil", 2));
          break;
        case 2:
          team2.add(new Crossbowman("Max", 2));
          break;
        default:
          team2.add(new Monk("Kostya", 2));
          break;
      }
    }
    //Collections.sort(team2);
    ArrayList<Hero> fighters = new ArrayList<>();
    fighters.addAll(team1);
    fighters.addAll(team2);
    Collections.sort(fighters);
    for (Hero item : fighters){
      System.out.println(item.getInfo());
    }
  }
}