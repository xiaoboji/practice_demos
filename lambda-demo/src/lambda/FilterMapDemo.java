package lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * @program: practice-demos
 * @description: filtermap demo
 * @author: xiaoboji
 * @create: 2020-07-09 23:29
 */
public class FilterMapDemo {
  private static Map<Integer, String> map = new HashMap<>();

  static {
    map.put(1, "a.com");
    map.put(2, "b.com");
    map.put(3, "c.com");
    map.put(4, "d.com");
  }

  public static void main(String[] args) {
    // Java 8之前的过滤map
    String result = null;
    for (Entry<Integer, String> entry : map.entrySet()) {
      if ("a.com".equals(entry.getValue())) {
        result = entry.getValue();
      }
    }

    System.out.println("Before Java 8 :" + result);

    // Java 8 Map ->Stream ->Filter ->String
    result =
        map.entrySet().stream()
            .filter(map -> "a.com".equals(map.getValue()))
            .map(map -> map.getValue())
            .collect(Collectors.joining());
    System.out.println("Java 8 :" + result);

    Map<Integer, String> collect =
        map.entrySet().stream()
            .filter(c -> c.getKey() == 2)
            .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
    System.out.println(collect);
  }
}
