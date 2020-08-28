package lambda;

/**
 * @program: practice-demos
 * @description: This a person Object
 * @author: xiaoboji
 * @create: 2020-07-09 22:37
 */
public class Person {

  public Person() {}

  public Person(int id, String name, String address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  /** id */
  private int id;

  /** 姓名 */
  private String name;

  /** 地址 */
  private String address;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person{" + "id=" + id + ", name='" + name + '\'' + ", address='" + address + '\'' + '}';
  }
}
