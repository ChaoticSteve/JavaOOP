import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Coordinate {
  protected int x;
  protected int y;
  public Coordinate(int x, int y){
    this.x = x;
    this.y = y;
  }
  @Override
  public String toString(){
    return String.format("(%d, %d)", this.x, this.y);
  } 
  public double getLength(Coordinate c){
    return sqrt(pow((this.x - c.x),2) + pow((this.y - c.y),2));
  }
}