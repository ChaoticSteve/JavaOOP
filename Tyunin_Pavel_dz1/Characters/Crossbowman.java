public class Crossbowman extends Hero{
  private int bolts;
  public Crossbowman(String name, int health, int damage, int bolts){
    super(name, health, damage);
    this.bolts = bolts;
  }
  public void makeShoot(){
    if (this.bolts > 0){
      this.bolts -= 1;
      System.out.printf("Выстрел! Осталось %d болтов.\n", this.bolts);      
    } else {
      System.out.println("Болтов нет");
    }
  }
}