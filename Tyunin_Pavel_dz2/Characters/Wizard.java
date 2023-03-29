public class Wizard extends Hero{
  private int mana;
  public Wizard (String name, int health, int damage, int mana){
    super(name, health, damage);
    this.mana = mana;
  }
  public void castFireball(){
    if (this.mana >= 10){
      System.out.println("Огненный шар летит в сторону врага!");
      this.mana -= 10;
    } else{
      System.out.println("Недостаточно маны!");
    }
  }
}