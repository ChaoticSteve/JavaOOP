
public class Rascal extends Hero{
   private int dexterity;
  public Rascal (String name, int health, int damage, int dexterity){
    super(name, health, damage);
    this.dexterity = dexterity;
  }
  public void makeStrike(){
    if ((int) (Math.random() * 100) < this.dexterity){
      System.out.printf("Подлый удар, урон удвоен!\nУрон: %d\n", this.damage*2);
    } else{
      System.out.printf("Простой удар.\nУрон: %d\n", this.damage);
    }
  }
}