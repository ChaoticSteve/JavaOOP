public class Sniper extends Hero{
  private int accuracy;
  public Sniper(String name, int health, int damage, int accuracy){
    super(name, health, damage);
    this.accuracy = accuracy;
  }
  public void makeShoot(int distance){
    if ((100*this.accuracy / distance) >= 50){
      System.out.println("Попадание!");
    }else {
      System.out.println("Промах!");
    }
  }
}