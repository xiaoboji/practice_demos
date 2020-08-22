package reflect;

/**
 * @program: practice-demos
 * @description: get a class
 * @author: xiaoboji
 * @create: 2020-08-22 01:17
 */
public class ReflectDemo1 {
  /**
   * 1. Class.forName(“全类名”)：将字节码文件加载进内存，返回class对象. 2. 类名.class：通过类型的属性class直接获取. 3.
   * 对象.getClass(）：已经有了对象，通过Object中的getClass()方法获取.
   */
  public static void main(String[] args) throws ClassNotFoundException {
    // 1.Class.forName(“全类名”)
    Class cls1 = Class.forName("reflect.Dog");
    System.out.println(cls1);

    // 2. 类名.class
    Class cls2 = Dog.class;
    System.out.println(cls2);

    // 3. 对象.getClass()
    Dog dog = new Dog();
    Class cls3 = dog.getClass();
    System.out.println(cls3);

    // 比较三个对象
    System.out.println(cls1 == cls2);
    System.out.println(cls1 == cls3);
    System.out.println(cls2 == cls3);
  }
}
