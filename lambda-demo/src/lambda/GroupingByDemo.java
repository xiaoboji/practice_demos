package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: practice-demos
 * @description: GroupingBy lambda demo
 * @author: xiaoboji
 * @create: 2020-07-09 23:12
 */
public class GroupingByDemo {

  private static List<Person> personList = new ArrayList<>();

  static {
    personList.add(new Person(10, "xiaoming", "chongqing"));
    personList.add(new Person(12, "xiaohei", "shanxi"));
    personList.add(new Person(16, "xiaohong", "chongqing"));
  }

  public static void main(String[] args) {
    // 按地址进行分组
    Map<String, List<Person>> collect =
        personList.stream().collect(Collectors.groupingBy(c -> c.getAddress()));
    System.out.print(collect);
  }
}
