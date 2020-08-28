package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: practice-demos
 * @description: get Fields demo
 * @author: xiaoboji
 * @create: 2020-08-22 22:51
 */
public class RelectDemo3 {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
          InvocationTargetException, InstantiationException {
    Class cls1 = Class.forName("reflect.Dog");
    // 有参构造函数
    Constructor constructor = cls1.getConstructor(String.class, int.class, String.class);
    System.out.println(constructor);
    Object dog = constructor.newInstance("汪汪", 2, "二哈");
    System.out.println(dog);

    // 无参构造函数
    // 方式一，使用Constructor的方法，有点繁琐
    Constructor constructor1 = cls1.getConstructor();
    System.out.println(constructor1);
    Object dog1 = constructor1.newInstance();
    System.out.println(dog1);
    // 方式二，Class对于无参构造函数直接提供了newInstance()
    Object dog2 = cls1.newInstance();
    System.out.println(dog2);
  }
}
