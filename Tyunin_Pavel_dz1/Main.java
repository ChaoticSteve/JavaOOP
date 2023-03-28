/**Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. 
Для каждого сформировать список свойств и возможных действий. 
Напрнимер свойство скорость, действие нанести удар. 
Проанализировать получившиеся свойства и действия персонажей и создать 
Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей.
Создать этот класс. 
Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс.
В основной программе создать по одному экземпляру каждого типа персонажей.*/
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Hero> characters = new ArrayList();
    characters.add(new Crossbowman("Ivan", 10, 10, 10));
    characters.add(new Monk("Pete", 15, 10, 3));
    characters.add(new Peasant("Oleg", 5, 5, false));
    characters.add(new Rascal("Artem", 10, 15, 5));
    characters.add(new Sniper("Nicolay", 10, 20, 50));
    characters.add(new Spearman("Gleb", 15, 5, 5));
    characters.add(new Wizard("Max", 5, 20, 20));
    for (Hero item : characters){
      item.getInfo();
    }
  }
}