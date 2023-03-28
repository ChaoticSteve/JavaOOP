public class Peasant extends Hero{
  private boolean satiety;
  public Peasant(String name, int health, int damage, boolean satiety){
    super(name, health, damage);
    this.satiety = satiety;
  }
  public void checkSatiety(){
    if (this.satiety) {
      System.out.println("Ваш крестянин сыт");
    } else {
      System.out.println("Ваш крестянин голод, здоровье уменьшено");
    }
  }
}