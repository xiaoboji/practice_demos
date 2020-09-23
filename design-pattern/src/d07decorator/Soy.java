package d07decorator;

/**
 * @program: practice-demos
 * @description: 调料代码 Soy
 * @author: xiaoboji
 * @create: 2020-09-24 00:30
 */
public class Soy extends CondimentDecorator {
  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  @Override
  public double cost() {
    return 0.25 + beverage.cost();
  }
}
