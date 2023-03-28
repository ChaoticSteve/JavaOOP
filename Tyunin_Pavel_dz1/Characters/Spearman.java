public class Spearman extends Hero{
  private int armor;
  public Spearman (String name, int health, int damage, int armor){
    super(name, health, damage);
    this.armor = armor;
  }
  public void blockDamage(){
    System.out.printf("Блокировано %d урона\n", this.armor);
  }
}