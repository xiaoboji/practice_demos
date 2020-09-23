package d07decorator;

/**
 * @program: practice-demos
 * @description: 调料代码 Whip
 * @author: xiaoboji
 * @create: 2020-09-24 00:30
 */
public class Whip extends CondimentDecorator {
  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public double cost() {
    return 0.35 + beverage.cost();
  }
}
