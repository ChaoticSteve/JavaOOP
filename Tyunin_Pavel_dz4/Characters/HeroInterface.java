import java.util.List;
public interface HeroInterface extends Comparable<Hero>{
  void step(List<Hero> f);
  String getInfo();
}