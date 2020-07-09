package lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @program: practice-demos
 * @description: Map lamdba demo
 * @author: xiaoboji
 * @create: 2020-07-09 22:54
 */
public class MapDemo {
  private static Map<String, Integer> items = new HashMap<>();

  static {
    items.put("A", 10);
    items.put("B", 20);
    items.put("C", 30);
    items.put("D", 40);
    items.put("E", 50);
    items.put("F", 60);
  }

  public static void main(String[] args) {
    // java 8之前map遍历
    for (Entry<String, Integer> entry : items.entrySet()) {
      System.out.print("  key:" + entry.getKey() + ",value:" + entry.getValue());
    }
    System.out.println();
    System.out.println("---------java 8使用lambda对Map进行遍历--------");
    // java 8 lambda遍历
    items.forEach((key, value) -> System.out.print("  key:" + key + ",value:" + value));
  }
}
