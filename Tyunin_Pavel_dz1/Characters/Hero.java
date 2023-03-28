public class Hero {
  protected String name;
  protected int health;
  protected int damage;
  public Hero(String name, int health, int damage){
    this.name = name;
    this.health = health;
    this.damage = damage;
  }
  public void getInfo(){
    System.out.printf("Имя: %s\nЗдоровье: %d\nУрон: %d\n", this.name, this.health, this.damage);
  }
}