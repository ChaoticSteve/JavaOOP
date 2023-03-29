/**Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo(); 
 * Реализовать интерфейсs в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа. 
 * Создать два списка в классе main. В кждый из списков добавить по десять экземнляров наследников BaseHero. 
 * Удалить ненужные методы из абстрактного класса, если такие есть.
 В main пройти по спискам и вызвать у всех персонажей getInfo.*/
import java.util.ArrayList;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    ArrayList<Hero> characters = new ArrayList();
    ArrayList<Hero> characters1 = new ArrayList();
    for (int i = 0; i < 10; i++){
        switch (new Random().nextInt(6)) {
            case 0:
                characters.add(new Crossbowman("Ivan", 10, 10, 10));
                break;
            case 1:
                characters.add(new Monk("Pete", 15, 10, 3));
                break;
            case 2:
                characters.add(new Peasant("Oleg", 5, 5, false));
                break;
            case 3:
                characters.add(new Rascal("Artem", 10, 15, 5));
                break;
            case 4:
                characters.add(new Sniper("Nicolay", 10, 20, 50));
                break;
            case 5:
                characters.add(new Spearman("Gleb", 15, 5, 5));
                break;
            case 6:
                characters.add(new Wizard("Max", 5, 20, 20));
                break;
        }
        switch (new Random().nextInt(6)) {
            case 0:
                characters1.add(new Crossbowman("Ivan", 10, 10, 10));
                break;
            case 1:
                characters1.add(new Monk("Pete", 15, 10, 3));
                break;
            case 2:
                characters1.add(new Peasant("Oleg", 5, 5, false));
                break;
            case 3:
                characters1.add(new Rascal("Artem", 10, 15, 5));
                break;
            case 4:
                characters1.add(new Sniper("Nicolay", 10, 20, 50));
                break;
            case 5:
                characters1.add(new Spearman("Gleb", 15, 5, 5));
                break;
            case 6:
                characters1.add(new Wizard("Max", 5, 20, 20));
                break;
        }
    }
    for (Hero item : characters){
      System.out.println(item.getInfo());
    }
    for (Hero item : characters1){
      System.out.println(item.getInfo());
    }
  }
}