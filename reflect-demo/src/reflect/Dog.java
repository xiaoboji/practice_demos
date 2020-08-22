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
  private int age;

  /**
   * Instantiates a new Dog.
   *
   * @param name the name
   * @param age the age
   */
  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
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
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets age.
   *
   * @return the age
   */
  public int getAge() {
    return age;
  }

  /**
   * Sets age.
   *
   * @param age the age
   */
  public void setAge(int age) {
    this.age = age;
  }
}
