package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: practice-demos
 * @description: List lambda demo
 * @author: xiaoboji
 * @create: 2020-07-09 22:41
 */
public class ListDemo {

  private static List<String> items = new ArrayList<>();

  static {
    items.add("A");
    items.add("BC");
    items.add("C");
    items.add("BD");
    items.add("E");
  }

  public static void main(String[] args) {
    // java 8之前操作list
    for (String item : items) {
      System.out.println(item);
    }

    // java 8使用lambda遍历list
    System.out.println("---------java 8使用lambda遍历list--------");
    items.forEach(item -> System.out.println(item));

    // java 8使用lambda进行判断
    System.out.println("---------java 8使用lambda进行判断--------");
    items.forEach(
        item -> {
          if ("C".equals(item) || "D".equals(item)) {
            System.out.println(item);
          }
        });

    // java 8使用lambda进行过滤
    System.out.println("---------java 8使用lambda进行过滤--------");
    items.stream().filter(s -> s.contains("B")).forEach(item -> System.out.println(item));
  }
}
