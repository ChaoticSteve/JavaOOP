public abstract class Magician extends Hero{
  protected int mana;
  public Magician(String name, int team, int health, int damage_min, int damage_max, int armor, int speed, int attack, int mana){
    super(name, team, health, damage_min, damage_max, armor, speed, attack);
    this.mana = mana;
  }
  @Override
  public String getInfo(){
    return super.getInfo() + String.format("Mana: %d\n", this.mana);
  }
}