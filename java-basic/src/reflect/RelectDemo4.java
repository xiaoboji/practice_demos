package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: practice-demos
 * @description: get Fields demo
 * @author: xiaoboji
 * @create: 2020-08-22 22:51
 */
public class RelectDemo4 {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
          IllegalAccessException {

    Class cls1 = Class.forName("reflect.Dog");
    // 执行方法
    System.out.println("---------------执行方法-----------------");
    Method method = cls1.getMethod("play", String.class);
    Dog dog = new Dog();
    method.invoke(dog, "飞盘");

    // 获取所有方法
    System.out.println("---------------获取所有方法-----------------");
    Method[] methods = cls1.getMethods();
    for (Method m : methods) {
      System.out.println(m);
    }
  }
}
