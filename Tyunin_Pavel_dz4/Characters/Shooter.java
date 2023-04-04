import java.util.List;
public abstract class Shooter extends Hero{
  protected int shots;
  public Shooter(String name, int team, int x, int y, int health, int damage_min, int damage_max, int armor, int speed, int attack, int shots){
    super(name, team, x, y, health, damage_min, damage_max, armor, speed, attack);
    this.shots = shots;
  }
  @Override
  public String getInfo(){
    return super.getInfo() + String.format("Shots: %d\n", this.shots);
  }
  @Override
  public void step(List<Hero> fighters){
    if (this.health <= 0 | this.shots <= 0)
      System.out.println("Нет стрел или здоровья");
    else{
      Hero opp = fighters.get(0);
      for (Hero item : fighters){
        if ((item.getTeam() != this.team) && (this.coord.getLength(opp.coord) > this.coord.getLength(item.coord)))
          opp = item;
        else if (item.getType().equals("Peasant") && item.getTeam() == this.team){
          this.shots += 1;
          //item.makeDelivery(this.shots);
        }
      } 
      this.makeShoot(opp);
    }
  }
  public void makeShoot(Hero enemy){
      enemy.armor -= ((this.damage_min + this.damage_max)/2);
      if (enemy.armor < 0){
          enemy.health += enemy.armor;
          enemy.armor = 0;
      }
      this.shots -= 1;
      //System.out.println(enemy.getInfo());
  }
}