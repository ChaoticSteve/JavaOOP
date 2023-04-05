public class Peasant extends Hero{
  private int delivery;
  public Peasant(String name, int team){
    super(name, team, 1, 1, 1, 1, 3, 1);
    this.delivery = 1;
  }
  @Override
  public String getInfo(){
    return super.getInfo() + String.format("Delivery: %d\n", this.delivery);
  }
}