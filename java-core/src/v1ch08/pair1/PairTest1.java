package v1ch08.pair1;

import v1ch08.Pair;

/**
 * @program: practice-demos
 * @description: Generic class
 * @author: xiaoboji
 * @create: 2020-07-13 23:08
 */
public class PairTest1 {
  public static void main(String[] args) {
    String[] words = {"Mary", "had", "a", "little", "lamb"};
    Pair<String> mm = ArrayAlg.minmax(words);
    System.out.println("min = " + mm.getFirst());
    System.out.println("max = " + mm.getSecond());
  }
}

class ArrayAlg {
  public static Pair<String> minmax(String[] a) {
    if (a == null || a.length == 0) {
      return null;
    }
    String min = a[0];
    String max = a[0];

    for (int i = 1; i < a.length; i++) {
      if (min.compareTo(a[i]) > 0) {
        min = a[i];
      }
      if (max.compareTo(a[i]) < 0) {
        max = a[i];
      }
    }
    return new Pair<>(min, max);
  }
}
