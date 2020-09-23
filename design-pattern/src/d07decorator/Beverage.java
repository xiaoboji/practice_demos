package d07decorator;

/**
 * @program: practice-demos
 * @description: 抽象类，有两个方法,getDescription() and cost()
 * @author: xiaoboji
 * @create: 2020-09-24 00:16
 */
public abstract class Beverage {
  String description = "unknown Beverage";

  public String getDescription() {
    return description;
  }

  /**
   * the cost
   *
   * @return
   */
  public abstract double cost();
}
