public class Monk extends Hero{
  private int ki;
  public Monk (String name, int health, int damage, int ki){
    super(name, health, damage);
    this.ki = ki;
  }
  public void flurryOfBlows(){
    if (this.ki > 1){
      System.out.println("Вы нанесли шквал ударов, урон утроен!");
      this.ki -= 1;
    }else System.out.println("Недостаточно Ци");
  }
}