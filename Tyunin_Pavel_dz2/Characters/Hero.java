public abstract class Hero implements HeroInterface{
  protected String name;
  protected int health;
  protected int damage;
  public Hero(String name, int health, int damage){
    this.name = name;
    this.health = health;
    this.damage = damage;
  }
  @Override
  public void step(){
    System.out.println("Шаг");
  }
  @Override
  public String getInfo(){
    return "Type: " + this.getClass().getName();
  }
}