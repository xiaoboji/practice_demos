package d07decorator;

/**
 * @program: practice-demos
 * @description: 开始点咖啡了
 * @author: xiaoboji
 * @create: 2020-09-24 00:32
 */
public class StarbuzzCoffee {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
    Beverage beverage1 = new HouseBlend();
    beverage1 = new Mocha(beverage1);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Soy(beverage1);
    beverage1 = new Whip(beverage1);
    System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
  }
}
