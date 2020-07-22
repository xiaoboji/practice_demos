package v1ch09.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: practice-demos
 * @description: this program demonstrates the use of a map with key type String and value type
 *     Employee
 * @author: xiaoboji
 * @create: 2020-07-23 00:21
 */
public class MapTest {
  public static void main(String[] args) {
    Map<String, String> staff = new HashMap<>();
    staff.put("144-25-5464", "A");
    staff.put("567-24-2546", "B");
    staff.put("567-24-2541", "C");
    staff.put("567-24-2542", "D");

    System.out.println(staff);

    staff.remove("567-24-2546");

    staff.put("111-22-2222", "E");

    staff.forEach((k, v) -> System.out.println("key = " + k + ",value = " + v));
  }
}
