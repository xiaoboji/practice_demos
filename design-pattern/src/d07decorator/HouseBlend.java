package d07decorator;

/**
 * @program: practice-demos
 * @description: 饮料代码House Blend
 * @author: xiaoboji
 * @create: 2020-09-24 00:22
 */
public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public double cost() {
    return 0.89;
  }
}
