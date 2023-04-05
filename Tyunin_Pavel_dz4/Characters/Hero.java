import java.util.List;
public abstract class Hero implements HeroInterface{
  protected String name;
  protected int health;
  protected int damage_min;
  protected int damage_max;
  protected int armor;
  protected int speed;
  protected int attack;
  protected int team;
  protected Coordinate coord;
  public Hero(String name, int team, int x, int y, int health, int damage_min, int damage_max, int armor, int speed, int attack){
    this.name = name;
    this.team = team;
    this.health = health;
    this.damage_min = damage_min;
    this.damage_max = damage_max;
    this.armor = armor;
    this.speed = speed;
    this.attack = attack;
    this.coord = new Coordinate(x, y);
  }
  public String getType(){
    return this.getClass().getName();
  }
  public int getTeam(){
    return this.team;
  }
  @Override
  public void step(List<Hero> f){
    System.out.println("Шаг");
  }
  @Override
  public String getInfo(){
    return String.format("Name: %s\nTeam: %d\nAttack: %d\nDefense: %d\nDamage: %d-%d\nHealth: %d\nSpeed: %d\nCoordinate: %s\n",
            this.name,
            this.team,
            this.attack,
            this.armor,
            this.damage_min,
            this.damage_max,
            this.health,
            this.speed,
            this.coord.toString());
    }
  @Override
  public int compareTo(Hero o){
    if (this.speed < o.speed) return 1;
    else if (this.speed > o.speed) return -1;
    else return 0;
  }
}