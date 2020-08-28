package reflect;

/**
 * The type Dog.
 *
 * @program: practice -demos
 * @description: This is a dog class
 * @author: xiaoboji
 * @create: 2020 -08-22 01:15
 */
public class Dog {

  private String name;
  public int age;
  public String type;

  /**
   * Instantiates a new Dog.
   *
   * @param name the name
   * @param age the age
   */
  public Dog(String name, int age, String type) {
    this.name = name;
    this.age = age;
    this.type = type;
  }

  /** Instantiates a new Dog. */
  public Dog() {}

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  private void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Dog{" + "name='" + name + '\'' + ", age=" + age + ", type='" + type + '\'' + '}';
  }

  public void play(String game) {
    System.out.println("一起来玩" + game);
  }
}
