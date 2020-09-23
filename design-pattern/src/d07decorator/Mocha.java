package d07decorator;

/**
 * @program: practice-demos
 * @description: 调料代码 Mocha
 * @author: xiaoboji
 * @create: 2020-09-24 00:24
 */
public class Mocha extends CondimentDecorator {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return 0.20 + beverage.cost();
  }
}
