package d07decorator;

/**
 * @program: practice-demos
 * @description: 饮料代码Espresso
 * @author: xiaoboji
 * @create: 2020-09-24 00:20
 */
public class Espresso extends Beverage {

  public Espresso() {
    description = "Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
