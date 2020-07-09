package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: practice-demos
 * @description: list to map lambda demo
 * @author: xiaoboji
 * @create: 2020-07-09 23:19
 */
public class List2MapDemo {
  private static List<Person> personList = new ArrayList<>();

  static {
    personList.add(new Person(10, "xiaoming", "chongqing"));
    personList.add(new Person(12, "xiaohei", "shanxi"));
  }

  public static void main(String[] args) {
    // java 8 list 转 Map
    Map<Integer, Person> map =
        personList.stream().collect(Collectors.toMap(key -> key.getId(), value -> value));
    map.forEach((key, value) -> System.out.println(key + ":" + value));
  }
}
