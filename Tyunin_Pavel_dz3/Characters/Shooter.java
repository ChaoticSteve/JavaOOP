public abstract class Shooter extends Hero{
  protected int shots;
  public Shooter(String name, int team, int health, int damage_min, int damage_max, int armor, int speed, int attack, int shots){
    super(name, team, health, damage_min, damage_max, armor, speed, attack);
    this.shots = shots;
  }
  @Override
  public String getInfo(){
    return super.getInfo() + String.format("Shots: %d\n", this.shots);
  }
}