package v1ch05.objectAnalyzer;

import java.util.ArrayList;

/**
 * @program: practice-demos
 * @description: This program uses reflection to spy on objects.
 * @author: xiaoboji
 * @create: 2020-07-01 23:01
 */
public class ObjectAnalyzerTest {
  public static void main(String[] args) {
    ArrayList<Integer> squares = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      squares.add(i * i);
    }
    System.out.println(new ObjectAnalyzer().toString(squares));
  }
}
