package reflect;

import java.lang.reflect.Field;

/**
 * @program: practice-demos
 * @description: get Fields demo
 * @author: xiaoboji
 * @create: 2020-08-22 22:51
 */
public class RelectDemo2 {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
    Class cls1 = Class.forName("reflect.Dog");

    // Field[] getFields() ：返回所有public的成员变量
    System.out.println("-------Field[] getFields() ：返回所有public的成员变量-------");
    Field[] fields = cls1.getFields();
    for (Field f : fields) {
      System.out.println(f);
    }

    // Field getField(String name) ：返回指定名称的public的成员变量
    System.out.println("-------Field getField(String name) ：返回指定名称的public的成员变量-------");
    Field field = cls1.getField("type");
    System.out.println(field);

    // 获取成员变量的值
    Dog dog1 = new Dog();
    Object value1 = field.get(dog1);
    System.out.println(value1);

    field.set(dog1, "二哈");
    value1 = field.get(dog1);
    System.out.println(value1);

    // Field[] getDeclaredFields() ：返回所有的成员变量
    System.out.println("-------Field[] getDeclaredFields() ：返回所有的成员变量-------");
    Field[] declaredFields = cls1.getDeclaredFields();
    for (Field f : declaredFields) {
      System.out.println(f);
    }

    // Field getDeclaredField(String name) ：返回指定名称的成员变量
    System.out.println("-------Field getDeclaredField(String name) ：返回指定名称的成员变量-------");
    Field declaredfiled = cls1.getDeclaredField("name");
    System.out.println(declaredfiled);

    // 获取成员变量的值
    Dog dog2 = new Dog();
    Object value2 = declaredfiled.get(dog2);
    System.out.println(value2);
    declaredfiled.setAccessible(true);
    declaredfiled.set(dog2, "汪汪");
    value2 = declaredfiled.get(dog2);
    System.out.println(value2);
  }
}
